public class SimpleMatcher{
    private String word;
    private boolean ignor;

    public SimpleMatcher(String word, boolean ignor) {
        this.word = word;
        this.ignor = ignor;
    }

    public boolean match(String line) {
        String lineForComparison = ignor ? line.toLowerCase() : line;
        String wordForComparison = ignor ? word.toLowerCase() : word;
        return  lineForComparison.contains(wordForComparison);
    }
}
