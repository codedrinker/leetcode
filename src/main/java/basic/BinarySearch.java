package basic;

/**
 * Created by codedrinker on 08/10/2017.
 */
public class BinarySearch {
    public int search(int[] arr, int target) {
        int l = 0, r = arr.length;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == target) return mid;
            if (arr[mid] > target) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return -1;
    }
}
