package algorithms.easy;

/**
 * Created by codedrinker on 19/09/2017.
 */
public class Palindrome {
    public boolean isPalindrome(int x) {
        int o = x;
        if (x < 0) {
            return false;
        }
        int res = 0;
        while (x != 0) {
            if (res > 214748364) {
                return false;
            }
            res = res * 10 + x % 10;
            x /= 10;
        }
        return res == o;
    }
}
