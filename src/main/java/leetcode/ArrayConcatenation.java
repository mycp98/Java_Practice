package leetcode;

import java.util.Arrays;

public class ArrayConcatenation {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println(Arrays.toString(concatenate(array)));
    }

    public static int[] concatenate(int[] input) {
        String inputString = Arrays.toString(input);
        String stringTwo = inputString.substring(1, inputString.length() - 1) + ", ";

        String stringRepeat = stringTwo.repeat(2);

        String finalString = stringRepeat.substring(0, stringRepeat.length() - 2);

        String[] answer = finalString.split(", ");

        int size = answer.length;

        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = Integer.parseInt(answer[i]);
        }

        return arr;
    }
}
