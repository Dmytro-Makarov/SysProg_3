package uni.makarov;

public class Patterns {
    public static final String NUMBERS = "\\b([0-9]*[.]?[0-9]+([oE][-+]?[0-9]+)?)";
    public static final String STRING_CONSTANTS = "\\\"(?:\\\\\\\\\\\"|[^\\\"])*?\\\"";
    public static final String CHAR_CONSTANTS = "\\'(?:\\\\\\\\\\'|[^\\'])*?\\'";
    public static final String COMMENTS = "(\\/\\/|#).*(\\r|\\n|\\r\\n$)";
    public static final String RESERVED_WORDS = "\\b(and|as|assert|break|class|continue|def|del|elif|else|except|False|finally|for|from|global|if|import|in|is|lambda|None|nonlocal|not|or|pass|raise|return|True|try|while|with|yield)\\b";
    public static final String OPERATORS = "\\.|\\+|\\+\\+|-|--|\\*|\\*\\*|\\/|\\/\\/|%|~|!|&|&&|=|\\+=|-=|\\*=|%=|\\/\\/=|\\*\\*=|&=|\\|=|^=|>>=|<<=|==|!=|>|<|>=|<=|\\||^|<<|>>|->";
    public static final String DELIMITERS = "[(){};,:\\[\\]\\\"\\']";
    public static final String IDENTIFIERS = "\\b[_A-Za-z][0-9A-Za-z]+\\b";
}