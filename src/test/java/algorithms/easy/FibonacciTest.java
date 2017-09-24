package algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by codedrinker on 23/09/2017.
 */
public class FibonacciTest {
    @Test
    public void recursion() throws Exception {
        long start = System.currentTimeMillis();
        assertEquals(102334155, new Fibonacci().recursion(40));
        System.out.println(System.currentTimeMillis() - start);
    }

    @Test
    public void on() throws Exception {
        long start = System.currentTimeMillis();
        assertEquals(1556111435, new Fibonacci().on(1000));
        System.out.println(System.currentTimeMillis() - start);
    }

}