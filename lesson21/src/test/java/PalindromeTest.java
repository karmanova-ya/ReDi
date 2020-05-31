import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {
    @Test
    public void testPalindromeNullString() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome(""));
    }

    @Test
    public void testPalindromePositiv() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome("radar"));
    }

    @Test
    public void testPalindromeNegativ() {
        Palindrome palindromeTester = new Palindrome();
        assertFalse(palindromeTester.isPalindrome("rapor"));
    }

    @Test
    public void testPalindromeSentencePositiv() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome("Was it a car or a cat I saw"));
    }

    @Test
    public void testPalindromeSentenceNegativ() {
        Palindrome palindromeTester = new Palindrome();
        assertFalse(palindromeTester.isPalindrome("reace car"));
    }
}
