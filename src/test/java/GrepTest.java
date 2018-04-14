import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GrepTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(System.out);
    }

    @Test
    public void test() {
        Grep.main(new String[]{"Hello","src/test/resources/sample.txt"});
        Assert.assertArrayEquals(new String[] {"1-Hello"},outContent.toString().split("\r?\n"));

    }
    @Test
    public void testRegexInvert() {
        Grep.main(new String[]{"-r","-v", "[a-z]", "src/test/resources/sample.txt"});
        Assert.assertArrayEquals(new String[] {"1-Hello", "2-Eee", "3-hello", "4-hEllO"},outContent.toString().split("\r?\n"));

    }
    @Test
    public void testRegexIgnorInvert() {
        Grep.main(new String[]{"-r","-i","-v", "[A-Z]", "src/test/resources/sample.txt"});
        Assert.assertArrayEquals(new String[] {"1-Hello", "2-Eee", "3-hello", "4-hEllO"},outContent.toString().split("\r?\n"));

    }
    @Test
    public void testSimpleInvert() {
        Grep.main(new String[]{"-v", "Hello", "src/test/resources/sample.txt"});
        Assert.assertArrayEquals(new String[] {"2-Eee", "3-hello", "4-hEllO"},outContent.toString().split("\r?\n"));

    } @Test
    public void testSimpleIgnorInvert() {
        Grep.main(new String[]{"-i","-v", "HELLO", "src/test/resources/sample.txt"});
        Assert.assertArrayEquals(new String[] {"2-Eee"},outContent.toString().split("\r?\n"));

    }



}