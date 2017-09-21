package algorithms.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by codedrinker on 19/09/2017.
 */
public class PalindromeTest {
    @Test
    public void isPalindrome() throws Exception {
        assertEquals(true, new Palindrome().isPalindrome(1));
        assertEquals(true, new Palindrome().isPalindrome(212));
        assertEquals(false, new Palindrome().isPalindrome(1121));
        assertEquals(true, new Palindrome().isPalindrome(1018101));
    }
}