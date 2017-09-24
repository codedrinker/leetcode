package algorithms.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by codedrinker on 23/09/2017.
 */
public class Fibonacci {
    public int recursion(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return recursion(n - 1) + recursion(n - 2);
    }

    private static Map<Integer, Integer> map = new HashMap();

    static {
        map.put(1, 1);
        map.put(0, 0);
    }

    public int on(int n) {
        if (!map.containsKey(n)) {
            map.put(n, on(n - 1) + on(n - 2));
        }
        return map.get(n);
    }
}
