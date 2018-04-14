import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatcher {

    static boolean match(String word, String line, boolean ignor){
        String regExpWord = word;
        int regFlags = ignor ? Pattern.CASE_INSENSITIVE : 0;
        Pattern compile = Pattern.compile(regExpWord, regFlags);
        Matcher matcher = compile.matcher(line);
        return matcher.find();
    }
}
