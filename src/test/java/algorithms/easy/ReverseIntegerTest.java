package algorithms.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by codedrinker on 15/09/2017.
 */
public class ReverseIntegerTest {
    @Test
    public void reverse() throws Exception {
        Assert.assertEquals(123, new ReverseInteger().reverse(321));
        Assert.assertEquals(-123, new ReverseInteger().reverse(-321));
        Assert.assertEquals(0, new ReverseInteger().reverse(0));
    }

}