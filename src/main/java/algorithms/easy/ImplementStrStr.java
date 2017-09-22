package algorithms.easy;

/**
 * Created by codedrinker on 22/09/2017.
 */
public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.length() == 0) {
            return -1;
        }
        char haystacks[] = haystack.toCharArray();
        char needles[] = needle.toCharArray();
        char first = needles[0];
        int max = haystack.length() - needles.length;
        for (int i = 0; i <= max; i++) {
            if (haystacks[i] != first) {
                while (++i <= max && haystacks[i] != first) ;
            }

            if (i <= max) {
                int j = i + 1;
                int end = j + needles.length - 1;

                for (int k = 1; j < end && haystacks[j] == needles[k]; k++, j++) {

                }
                if (j == end) return i;
            }
        }
        return -1;
    }
}
