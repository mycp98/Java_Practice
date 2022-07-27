package leetcode;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,4,3,2,1};
        System.out.println(Arrays.toString(shuffle(nums, 4)));
    }

    public static int[] shuffle(int[] nums, int n) {

        int[] newArray = new int[2*n];
        System.out.println(Arrays.toString(newArray));

        int i = 0;
        int counter = 0;
        int j= n;
        while (counter < 2*n) {
            if(counter%2==0){
                newArray[counter]=nums[i];
                i++;
            }
            else {
                newArray[counter]=nums[j];
                 j++;
            }
            counter++;
        }

        return newArray;
    }
}
