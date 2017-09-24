package algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by codedrinker on 24/09/2017.
 */
public class RemoveElementTest {
    @Test
    public void removeElement() throws Exception {
        assertEquals(2, new RemoveElement().removeElement(new int[]{3, 2, 2, 3}, 3));
    }

}