package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class palindromeNumberTest {
    @Test
    void isPalindrome_mustReturnTrueWhenNumberIsPalindrome() {
        int x = 4004;

        boolean expected = true;

        boolean actual = PalindromeNumber.isPalindrome(x);

        assertEquals(actual, expected);

    }

    @Test
    void isPalindrome_mustReturnFalseWhenNumberIsNotPalindrome() {
        int x = 1234;

        boolean expected = false;

        boolean actual = PalindromeNumber.isPalindrome(x);

        assertEquals(actual, expected);

    }


}