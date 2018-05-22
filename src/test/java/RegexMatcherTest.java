import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegexMatcherTest {

    @Test
    public void test() {
        RegexMatcher regexMatcher = new RegexMatcher("\\W", false);
        Assert.assertEquals(false, regexMatcher.match("Hello"));
        regexMatcher = new RegexMatcher("\\d", false);
        Assert.assertEquals(false, regexMatcher.match("Hello World!"));
        regexMatcher = new RegexMatcher("\\w", true);
        Assert.assertEquals(true, regexMatcher.match("HELLO World!"));
        regexMatcher = new RegexMatcher("[a-z]+", true);
        Assert.assertEquals(true, regexMatcher.match("HELLO WORLD!"));
        regexMatcher = new RegexMatcher("[A-Z]+", false);
        Assert.assertEquals(false, regexMatcher.match("hello world!"));
    }
}