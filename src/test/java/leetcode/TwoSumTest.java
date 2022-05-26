package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {
    @Test
    void twoSum_mustReturnCorrectArrayOfIndices() {
        int[] inputArray = {2,7,11,15};
        int target = 9;

        int[] expected = {0,1};

        int[] actual = TwoSum.twoSum(inputArray, target);

        assertEquals(Arrays.toString(expected), Arrays.toString(actual));
    }

}