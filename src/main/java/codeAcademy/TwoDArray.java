package codeAcademy;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {

        // Declare a 2d array of float values called floatTwoD
        float[][] floatTwoD;

        // Initialize the 2d array from the last step to an empty 2d array consisting of 4 arrays with 10 elements each
        floatTwoD = new float[4][10];

        // Declare and initialize an empty 2d array of integers consisting of 15 rows and 8 columns called dataChart
        int[][] dataChart = new int[15][8];

        // Create a 2D char array called ticTacToe representing the provided tic-tac-toe board. Use the characters 'X', 'O', and ' '.


        // When no one is looking, you want to modify the game to where you, 'O', wins the game. Replace the game board so that all X’s are O’s and all O’s are X’s. Do this in one line with initializer lists.
        char[][] ticTacToe = {{'X', 'O', 'O'}, {'O', 'X', ' '}, {'X', ' ', 'X'}};

        ticTacToe = new char[][]{{'O', 'X', 'X'}, {'X', 'O', ' '}, {'O', ' ', 'O'}};

        System.out.println(Arrays.deepToString(ticTacToe));


        char[][] letterBlock = {{'a','b','c'},{'d','e','f'},{'g','h','i'},{'j', 'k', 'l'}};

        for(int a = 0; a < letterBlock.length; a++) {
            for(int b = 0; b < letterBlock[a].length; b++) {
                System.out.print("Accessed: " + letterBlock[a][b] + "\t");
            }
            System.out.println();
        }
    }
}
