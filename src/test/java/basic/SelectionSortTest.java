package basic;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by codedrinker on 08/10/2017.
 */
public class SelectionSortTest {
    @Test
    public void sort() throws Exception {
        int[] sort = new SelectionSort().sort(new int[]{23, 43, 1, 6, 22});
        Assert.assertArrayEquals(new int[]{1, 6, 22, 23, 43}, sort);
    }

}