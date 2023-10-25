package codeAcademy;

import java.util.Arrays;
//2D Arrays
public class Review1 {
    public static void main(String[] args) {
        String[][] words = {{"championship", "QUANTITY", "month"},{"EMPLOYEE", "queen", "understanding"},{"method", "writer", "MOVIE"}};

        System.out.println("Before...");
        System.out.println(Arrays.deepToString(words).replace("],", "],\n") + "\n");

        for(int i=0; i<words.length; i++) {
            for(int j = 0; j<words[i].length; j++) {
                if(words[i][j]!=null) {

                    // Check the capitalization
                    boolean allCaps = true;
                    for(char c : words[i][j].toCharArray())
                        if(!Character.isUpperCase(c))
                            allCaps = false;

                    // Flip the capitalization
                    if(allCaps)
                        words[i][j] = words[i][j].toLowerCase();
                    else
                        words[i][j] = words[i][j].toUpperCase();
                }
            }
        }

        System.out.println("After...");
        System.out.println(Arrays.deepToString(words).replace("],", "],\n") + "\n");
    }
}
