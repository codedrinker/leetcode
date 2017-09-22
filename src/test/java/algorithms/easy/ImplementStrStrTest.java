package algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by codedrinker on 22/09/2017.
 */
public class ImplementStrStrTest {
    @Test
    public void strStr() throws Exception {
        assertEquals(2, new ImplementStrStr().strStr("abcded", "cd"));
    }

}