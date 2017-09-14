package algorithms.easy;

/**
 * Created by codedrinker on 15/09/2017.
 */
public class ReverseInteger {
    public int reverse(int x) {
        int result = 0;

        while (x != 0) {
            if (Math.abs(result) > 214748364) {
                return 0;
            }
            result = result * 10 + x % 10;
            x /= 10;
        }
        return result;
    }
}
