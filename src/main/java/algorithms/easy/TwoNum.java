package algorithms.easy;

import java.util.HashMap;

/**
 * Created by codedrinker on 11/09/2017.
 */
public class TwoNum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer integer = map.get(target - nums[i]);
            if (integer != null) {
                result[0] = integer;
                result[1] = i;
                break;
            }
            map.put(nums[i], i);

        }
        return result;
    }
}
