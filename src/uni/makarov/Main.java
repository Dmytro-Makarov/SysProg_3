package uni.makarov;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws IOException {
	StringBuilder text = new StringBuilder();
    try (BufferedReader reader = new BufferedReader(new FileReader("test.py"))) {
        reader.lines().forEach(s -> {
            text.append(s);
            text.append("\n");
        });
    }
    Analyzer analyzer = new Analyzer();
    analyzer.analysis(text.toString(), buildPatterns());
    }

    private static List<Analyzer.PatternWithName> buildPatterns() {
        List<Analyzer.PatternWithName> patterns = new ArrayList<>();
        patterns.add(new Analyzer.PatternWithName(Pattern.compile(Patterns.NUMBERS), "Number"));
        patterns.add(new Analyzer.PatternWithName(Pattern.compile(Patterns.STRING_CONSTANTS), "String"));
        patterns.add(new Analyzer.PatternWithName(Pattern.compile(Patterns.CHAR_CONSTANTS), "Character"));
        patterns.add(new Analyzer.PatternWithName(Pattern.compile(Patterns.RESERVED_WORDS), "Keyword"));
        patterns.add(new Analyzer.PatternWithName(Pattern.compile(Patterns.OPERATORS), "Operator"));
        patterns.add(new Analyzer.PatternWithName(Pattern.compile(Patterns.DELIMITERS), "Delimeter"));
        patterns.add(new Analyzer.PatternWithName(Pattern.compile(Patterns.IDENTIFIERS), "Identifier"));
        return patterns;
    }
}
