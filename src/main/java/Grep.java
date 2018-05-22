import java.io.*;
import java.util.Objects;

public class Grep {

    public static void main(String[] args) {
        boolean invert = false;
        String word = null;
        boolean regex = false;
        String file = null;
        boolean ignor = false;
        for (int i = 0; i < args.length; i++) {
            String cur = args[i];
            if (Objects.equals(cur, "-v")) {
                invert = true;
                continue;
            }
            if (Objects.equals(cur, "-r")) {
                regex = true;
                continue;
            }
            if (Objects.equals(cur, "-i")) {
                ignor = true;
                continue;
            }
            if (word == null) {
                word = args[i];
                continue;
            }
            file = args[i];
        }
        String line;
        try (BufferedReader br =
                     new BufferedReader(new FileReader(file))) {
            SimpleMatcher simpleMatcher = new SimpleMatcher(word, ignor);
            RegexMatcher regexMatcher = new RegexMatcher(word, ignor);
            while ((line = br.readLine()) != null) {
                boolean match = false;
                if (!regex) {
                    match = simpleMatcher.match(line);
                } else if (regex) {
                    match = regexMatcher.match(line);
                }

                if (invert) {
                    match = !match;
                }
                if (match) {
                    System.out.println(line);
                }
            }


        } catch (IOException exc) {
            System.out.println("Ошибка ввода-ввывода:" + exc);
        }

    }

}

