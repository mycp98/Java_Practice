package leetcode;

public class NoOfStepsToGetToZero {
    public static void main(String[] args) {
        System.out.println(numberOfSteps(123));

    }

    public static int numberOfSteps(int num) {
        int counter = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num /= 2;
            } else {
                num -= 1;
            }
           counter ++;
        }
        return counter;
    }
}
