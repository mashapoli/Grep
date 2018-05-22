import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcher {
    private String word;
    private boolean ignor;

    public RegexMatcher(String word, boolean ignor) {
        this.word = word;
        this.ignor = ignor;
    }

    public  boolean match(String line){
        String regExpWord = word;
        int regFlags = ignor ? Pattern.CASE_INSENSITIVE : 0;
        Pattern compile = Pattern.compile(regExpWord, regFlags);
        Matcher matcher = compile.matcher(line);
        return matcher.find();
    }
}
