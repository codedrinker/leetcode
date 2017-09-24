package algorithms.easy;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by codedrinker on 23/09/2017.
 */
public class MaximumSubarrayTest {
    @Test
    public void maxSubArray() throws Exception {
        int nums[] = new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Assert.assertEquals(6, new MaximumSubarray().maxSubArray(nums));
    }

    @Test
    public void maxSubArray2() throws Exception {
        int nums[] = new int[]{-2, 1, -3};
        Assert.assertEquals(1, new MaximumSubarray().maxSubArray(nums));
    }

}