package de.fosd.typechef.crewrite

import org.kiama.rewriting.Rewriter._

import de.fosd.typechef.parser.c._
import de.fosd.typechef.typesystem.UseDeclMap
import de.fosd.typechef.featureexpr.{FeatureExpr, FeatureModel}

// implements a simple analysis of uninitalized memory
// https://www.securecoding.cert.org/confluence/display/seccode/EXP33-C.+Do+not+reference+uninitialized+memory
// EXP33
//
// major limitations:
//   - we use intraprocedural control flow (IntraCFG) which
//     is a conservative analysis for program flow
//     so the analysis will likely produce a lot
//     of false positives, because memory can be initialized
//     in a different function
//   - this analysis does not cover use of dynamically allocated
//     memory which is usually covered by other analysis tools.
class UninitializedMemory(env: ASTEnv, udm: UseDeclMap, fm: FeatureModel) extends MonotoneFWId(env, udm, fm) with IntraCFG with CFGHelper with ASTNavigation {
    // get all Id's passed to a function
    def getFunctionCallArguments(e: AST) = {
        var res = Set[Id]()
        val fcs = filterAllASTElems[FunctionCall](e)
        val arguments = manybu(query {
            case i: Id => res += i
            case PostfixExpr(i@Id(_), FunctionCall(_)) => res -= i
        })

        fcs.map(arguments(_))
        addAnnotations(res)
    }

    // get all declared variables without an initialization
    def gen(a: AST): Map[FeatureExpr, Set[Id]] = {
        var res = Set[Id]()
        val variables = manytd(query {
            case InitDeclaratorI(AtomicNamedDeclarator(_, i: Id, _), _, None) => res += i
        })

        variables(a)
        addAnnotations(res)
    }

    // get variables that get an assignment
    def kill(a: AST): Map[FeatureExpr, Set[Id]] = {
        var res = Set[Id]()
        val assignments = manytd(query {
            case AssignExpr(target@Id(_), "=", _) => res += target
        })

        assignments(a)
        addAnnotations(res)
    }

    protected def F(e: AST) = flow(e)

    protected val i = Map[Id, FeatureExpr]()
    protected def b = Map[Id, FeatureExpr]()
    protected def combinationOperator(r: L, f: FeatureExpr, s: Set[Id]) = union(r, f, s)

    protected def circle(e: AST) = exitcache(e)
    protected def point(e: AST) = entrycache(e)
}
