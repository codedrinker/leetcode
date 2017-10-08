package basic;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by codedrinker on 08/10/2017.
 */
public class BinarySearchTest {
    @Test
    public void search() throws Exception {
        Assert.assertEquals(8, new BinarySearch().search(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 29}, 9));
        Assert.assertEquals(0, new BinarySearch().search(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 29}, 1));
        Assert.assertEquals(19, new BinarySearch().search(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 29}, 29));
    }

}