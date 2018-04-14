import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegexMatcherTest {

    @Test
    public void test() {
        Assert.assertEquals(false, RegexMatcher.match( "Hello","\\W", false));
        Assert.assertEquals(false, RegexMatcher.match( "Hello World!","\\d", false));
        Assert.assertEquals(true, RegexMatcher.match( "HELLO World!","\\w", true));
        Assert.assertEquals(true, RegexMatcher.match( "HELLO WORLD!","[a-z]+", true));
        Assert.assertEquals(false, RegexMatcher.match( "hello world!","[A-Z]+", false));
    }
}