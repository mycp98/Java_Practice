package leetcode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {4,3,8,2};
        int target = 5;
        //call method
        System.out.println(Arrays.toString(twoSum(nums, target)));


    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            //System.out.println(nums[i]);
            int x = nums[i];
            int y = target-x;
            for (int j = i; j < nums.length ; j++) {
                if(i != j && nums[j]==y){
                    return new int[] {i,j};
                }
            }
        }
        return null;
    }
}
