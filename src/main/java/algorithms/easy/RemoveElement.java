package algorithms.easy;

/**
 * Created by codedrinker on 24/09/2017.
 * http://patchouli-know.com/2017/05/06/remove-error-in-list/
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
