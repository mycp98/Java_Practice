package leetcode;

import java.util.Arrays;

public class Truncate {
    public static void main(String[] args) {
        System.out.println(truncateSentence("eET YZfz Y VHpNQunwl HQU F gD LOqW snNPzZA Ts av Wbbm h p Sbv BnOSq", 2));
    }
    public static String truncateSentence(String s, int k) {
        String[] stringArray = s.split(" ");
        System.out.println(Arrays.toString(stringArray));
//        return String.join(" ", stringArray);
        String targetString = stringArray[k];
        System.out.println(targetString);
        int index = s.indexOf(targetString);
        System.out.println(index);

        return s.substring(0, index-1);

    }

}
