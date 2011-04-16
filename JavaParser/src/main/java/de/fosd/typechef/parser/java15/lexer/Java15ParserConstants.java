/* Generated By:JavaCC: Do not edit this line. Java15ParserConstants.java */
package de.fosd.typechef.parser.java15.lexer;

public interface Java15ParserConstants {

    int EOF = 0;
    int SINGLE_LINE_COMMENT = 9;
    int FORMAL_COMMENT = 10;
    int MULTI_LINE_COMMENT = 11;
    int ABSTRACT = 13;
    int ASSERT = 14;
    int BOOLEAN = 15;
    int BREAK = 16;
    int BYTE = 17;
    int CASE = 18;
    int CATCH = 19;
    int CHAR = 20;
    int CLASS = 21;
    int CONST = 22;
    int CONTINUE = 23;
    int _DEFAULT = 24;
    int DO = 25;
    int DOUBLE = 26;
    int ELSE = 27;
    int ENUM = 28;
    int EXTENDS = 29;
    int FALSE = 30;
    int FINAL = 31;
    int FINALLY = 32;
    int FLOAT = 33;
    int FOR = 34;
    int GOTO = 35;
    int IF = 36;
    int IMPLEMENTS = 37;
    int IMPORT = 38;
    int INSTANCEOF = 39;
    int INT = 40;
    int INTERFACE = 41;
    int LONG = 42;
    int NATIVE = 43;
    int NEW = 44;
    int NULL = 45;
    int PACKAGE = 46;
    int PRIVATE = 47;
    int PROTECTED = 48;
    int PUBLIC = 49;
    int RETURN = 50;
    int SHORT = 51;
    int STATIC = 52;
    int STRICTFP = 53;
    int SUPER = 54;
    int SWITCH = 55;
    int SYNCHRONIZED = 56;
    int THIS = 57;
    int THROW = 58;
    int THROWS = 59;
    int TRANSIENT = 60;
    int TRUE = 61;
    int TRY = 62;
    int VOID = 63;
    int VOLATILE = 64;
    int WHILE = 65;
    int INTEGER_LITERAL = 66;
    int DECIMAL_LITERAL = 67;
    int HEX_LITERAL = 68;
    int OCTAL_LITERAL = 69;
    int FLOATING_POINT_LITERAL = 70;
    int EXPONENT = 71;
    int CHARACTER_LITERAL = 72;
    int STRING_LITERAL = 73;
    int IDENTIFIER = 74;
    int LETTER = 75;
    int DIGIT = 76;
    int LPAREN = 77;
    int RPAREN = 78;
    int LBRACE = 79;
    int RBRACE = 80;
    int LBRACKET = 81;
    int RBRACKET = 82;
    int SEMICOLON = 83;
    int COMMA = 84;
    int DOT = 85;
    int AT = 86;
    int ASSIGN = 87;
    int LT = 88;
    int BANG = 89;
    int TILDE = 90;
    int HOOK = 91;
    int COLON = 92;
    int EQ = 93;
    int LE = 94;
    int GE = 95;
    int NE = 96;
    int SC_OR = 97;
    int SC_AND = 98;
    int INCR = 99;
    int DECR = 100;
    int PLUS = 101;
    int MINUS = 102;
    int STAR = 103;
    int SLASH = 104;
    int BIT_AND = 105;
    int BIT_OR = 106;
    int XOR = 107;
    int REM = 108;
    int LSHIFT = 109;
    int PLUSASSIGN = 110;
    int MINUSASSIGN = 111;
    int STARASSIGN = 112;
    int SLASHASSIGN = 113;
    int ANDASSIGN = 114;
    int ORASSIGN = 115;
    int XORASSIGN = 116;
    int REMASSIGN = 117;
    int LSHIFTASSIGN = 118;
    int RSIGNEDSHIFTASSIGN = 119;
    int RUNSIGNEDSHIFTASSIGN = 120;
    int ELLIPSIS = 121;
    int GT = 122;

    int DEFAULT = 0;
    int IN_SINGLE_LINE_COMMENT = 1;
    int IN_FORMAL_COMMENT = 2;
    int IN_MULTI_LINE_COMMENT = 3;

    String[] tokenImage = {
            "<EOF>",
            "\" \"",
            "\"\\t\"",
            "\"\\n\"",
            "\"\\r\"",
            "\"\\f\"",
            "\"//\"",
            "<token of kind 7>",
            "\"/*\"",
            "<SINGLE_LINE_COMMENT>",
            "\"*/\"",
            "\"*/\"",
            "<token of kind 12>",
            "\"abstract\"",
            "\"assert\"",
            "\"boolean\"",
            "\"break\"",
            "\"byte\"",
            "\"case\"",
            "\"catch\"",
            "\"char\"",
            "\"class\"",
            "\"const\"",
            "\"continue\"",
            "\"default\"",
            "\"do\"",
            "\"double\"",
            "\"else\"",
            "\"enum\"",
            "\"extends\"",
            "\"false\"",
            "\"final\"",
            "\"finally\"",
            "\"float\"",
            "\"for\"",
            "\"goto\"",
            "\"if\"",
            "\"implements\"",
            "\"import\"",
            "\"instanceof\"",
            "\"int\"",
            "\"interface\"",
            "\"long\"",
            "\"native\"",
            "\"new\"",
            "\"null\"",
            "\"package\"",
            "\"private\"",
            "\"protected\"",
            "\"public\"",
            "\"return\"",
            "\"short\"",
            "\"static\"",
            "\"strictfp\"",
            "\"super\"",
            "\"switch\"",
            "\"synchronized\"",
            "\"this\"",
            "\"throw\"",
            "\"throws\"",
            "\"transient\"",
            "\"true\"",
            "\"try\"",
            "\"void\"",
            "\"volatile\"",
            "\"while\"",
            "<INTEGER_LITERAL>",
            "<DECIMAL_LITERAL>",
            "<HEX_LITERAL>",
            "<OCTAL_LITERAL>",
            "<FLOATING_POINT_LITERAL>",
            "<EXPONENT>",
            "<CHARACTER_LITERAL>",
            "<STRING_LITERAL>",
            "<IDENTIFIER>",
            "<LETTER>",
            "<DIGIT>",
            "\"(\"",
            "\")\"",
            "\"{\"",
            "\"}\"",
            "\"[\"",
            "\"]\"",
            "\";\"",
            "\",\"",
            "\".\"",
            "\"@\"",
            "\"=\"",
            "\"<\"",
            "\"!\"",
            "\"~\"",
            "\"?\"",
            "\":\"",
            "\"==\"",
            "\"<=\"",
            "\">=\"",
            "\"!=\"",
            "\"||\"",
            "\"&&\"",
            "\"++\"",
            "\"--\"",
            "\"+\"",
            "\"-\"",
            "\"*\"",
            "\"/\"",
            "\"&\"",
            "\"|\"",
            "\"^\"",
            "\"%\"",
            "\"<<\"",
            "\"+=\"",
            "\"-=\"",
            "\"*=\"",
            "\"/=\"",
            "\"&=\"",
            "\"|=\"",
            "\"^=\"",
            "\"%=\"",
            "\"<<=\"",
            "\">>=\"",
            "\">>>=\"",
            "\"...\"",
            "\">\"",
    };

}
