package ua.training;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class ArithmeticTest {
    private Arithmetic arithmetic;

    @Before
    public void init() {
        arithmetic = new Arithmetic();
    }

    @Rule
    public final ExpectedException exception = ExpectedException.none();
    @Rule
    public final Timeout timeout = new Timeout(1000);

    @Test
    public void testAdd() throws Exception {
        double result = arithmetic.add(4, 5);
        assertTrue(result == 9);
    }

    @Test
    public void notNullTest() throws Exception {
        assertNotNull(arithmetic);
    }

    @Test
    public void multiply() throws Exception {
    }

    //@Test(expected = Exception.class)
    @Test
    public void divideTest() throws Exception {
        exception.expect(IllegalArgumentException.class);
        arithmetic.divide(4, 0);
    }

    @Test(timeout = 1000)
    public void testN() throws InterruptedException {
        Thread.sleep(999);
    }

}