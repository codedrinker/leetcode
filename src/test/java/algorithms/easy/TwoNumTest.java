package algorithms.easy;


import org.junit.Assert;
import org.junit.Test;

/**
 * Created by codedrinker on 11/09/2017.
 */
public class TwoNumTest {
    @Test
    public void twoSum() throws Exception {
        int[] actual = new TwoNum().twoSum(new int[]{2, 7, 11, 15}, 9);
        Assert.assertEquals(0, actual[0]);
        Assert.assertEquals(1, actual[1]);
    }
    @Test
    public void twoSum2() throws Exception {
        int[] actual = new TwoNum().twoSum(new int[]{3, 2, 4}, 6);
        Assert.assertEquals(1, actual[0]);
        Assert.assertEquals(2, actual[1]);
    }

}