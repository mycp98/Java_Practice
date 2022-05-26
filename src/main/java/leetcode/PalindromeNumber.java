package leetcode;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(2002));
    }

    public static boolean isPalindrome(int x) {

        String integer = Integer.toString(x);

        StringBuilder anything = new StringBuilder(integer);
        String reversedNum = anything.reverse().toString();

        System.out.println(reversedNum);
//        String[] array = integer.split("");
//
//        String reversedNum = "";
//
//        for (int i = array.length - 1; i >= 0; i--) {
//            //reversedNum = reversedNum + array[i]
//            reversedNum += array[i];
//        }
//
        return integer.equals(reversedNum);
    }
}
