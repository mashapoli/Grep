import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleMatcherTest {

    @Test
    public void test() {
        SimpleMatcher simpleMatcher = new SimpleMatcher("Hello", false);
        Assert.assertEquals(true, simpleMatcher.match("Hello, world!"));
        simpleMatcher = new SimpleMatcher("hello", true);
        Assert.assertEquals(true, simpleMatcher.match("Hello, world!"));
         simpleMatcher = new SimpleMatcher("Hello!", true);
        Assert.assertEquals(false, simpleMatcher.match("Hello, world!"));
    }
}
