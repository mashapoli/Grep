import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleMatcherTest {

    @Test
    public void match() {
//        String [] grep = new String[]{"-i", "Hello", "C:\\Users\\rolling\\Desktop\\grep.txt"} ;
//        SimpleMatcher match1 = match();
        Assert.assertEquals(true, SimpleMatcher.match("Hello", "Hello, world!", false));
    }
    @Test
    public void match2() {
        Assert.assertEquals(true, SimpleMatcher.match("hello", "Hello, world!", true));
    }
    @Test
    public void match3() {
        Assert.assertEquals(false, SimpleMatcher.match("Hello!", "Hello, world!", true));
    }
}
//}
//    double[] vector = new double[]{Math.sqrt(14) / 14, -Math.sqrt(14) / 7, (3 * Math.sqrt(14)) / 14};
//    Quaternion quaternion2 = quaternion.create(Math.PI / 6, vector[0], vector[1], vector[2]);
//        Assert.assertArrayEquals(vector, quaternion2.getUnitVector(), delta);