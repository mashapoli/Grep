import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RegexMatcherTest {

    @Test
    public void match() {
        Assert.assertEquals(false, RegexMatcher.match( "Hello","\\W", false));
    }
    @Test
    public void match1() {
        Assert.assertEquals(false, RegexMatcher.match( "Hello World!","\\d", false));
    }
    @Test
    public void match2() {
        Assert.assertEquals(true, RegexMatcher.match( "HELLO World!","\\w", true));
    }
    @Test
    public void match3() {
        Assert.assertEquals(true, RegexMatcher.match( "HELLO WORLD!","[a-z]+", true));
    }
    @Test
    public void match4() {
        Assert.assertEquals(false, RegexMatcher.match( "hello world!","[A-Z]+", false));
    }
}