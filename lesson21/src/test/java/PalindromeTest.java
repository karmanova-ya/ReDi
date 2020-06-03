import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {

    @Test
    void testPalindromeNullString() {
        Palindrome palindromeTester = new Palindrome();
        Assertions.assertThrows(NullPointerException.class, () -> palindromeTester.isPalindrome(null));

    }

    @Test
    void testPalindromeEmptyString() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome(""));
    }

    @Test
    void testPalindromePositiv() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome("radar"));
    }

    @Test
    void testPalindromeNegativ() {
        Palindrome palindromeTester = new Palindrome();
        assertFalse(palindromeTester.isPalindrome("rapor"));
    }

    @Test
    void testPalindromeSentencePositiv() {
        Palindrome palindromeTester = new Palindrome();
        assertTrue(palindromeTester.isPalindrome("Was it a car or a cat I saw"));
    }

    @Test
    void testPalindromeSentenceNegativ() {
        Palindrome palindromeTester = new Palindrome();
        assertFalse(palindromeTester.isPalindrome("reace car"));
    }
}
