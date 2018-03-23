
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FizzBuzzTest {
    FizzBuzz fb;
    @Before
    public void setup() {
        fb = new FizzBuzz();
    }

    @Test
    public void testNonNegativeInteger()
    {
        String result=fb.translate(2);
        assertTrue(result.equals("2"));
    }

    @Test
    public void testFizz()
    {
        String result = fb.translate(3);
        assertEquals("fizz", result);
    }

    @Test
    public void testBuzz()
    {
        String result=fb.translate(5);
        assertEquals("buzz", result);
    }

    @Test
    public void testFizzBuzz()
    {
        String result = fb.translate(15);
        assertEquals("fizzbuzz", result);
    }

    @Test(expected = RuntimeException.class)
    public void testNonPositiveInteger() {
        fb.translate(-5);

    }

}