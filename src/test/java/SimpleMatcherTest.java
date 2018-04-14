import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleMatcherTest {

    @Test
    public void test() {
        Assert.assertEquals(true, SimpleMatcher.match("Hello", "Hello, world!", false));
        Assert.assertEquals(true, SimpleMatcher.match("hello", "Hello, world!", true));
        Assert.assertEquals(false, SimpleMatcher.match("Hello!", "Hello, world!", true));
    }
}
