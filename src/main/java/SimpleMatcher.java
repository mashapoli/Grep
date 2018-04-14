public class SimpleMatcher {
    static boolean match(String word,String line,boolean ignor) {
        String lineForComparison = ignor ? line.toLowerCase() : line;
        String wordForComparison = ignor ? word.toLowerCase() : word;
        return  lineForComparison.contains(wordForComparison);
    }
}
