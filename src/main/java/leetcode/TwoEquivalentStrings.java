package leetcode;

public class TwoEquivalentStrings {
    public static void main(String[] args) {
        String[] input1 = {"a", "cb"};
        String[] input2 = {"a", "bc"};
        System.out.println(arrayStringsAreEqual(input1, input2));

    }

    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {

        String string1 = String.join("",word1);
        String string2 = String.join("",word2);

        return string1.equals(string2);
    }
}
