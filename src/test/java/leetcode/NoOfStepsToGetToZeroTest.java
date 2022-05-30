package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoOfStepsToGetToZeroTest {

    @Test
    void numberOfSteps_mustReturnCorrectNumber() {
        int input = 123;

        int expected = 12;

        int actual = NoOfStepsToGetToZero.numberOfSteps(input);

        assertEquals(expected, actual);
    }

}