package leetcode;

public class IntegerToRoman {
    public static void main(String[] args) {
        System.out.println(intToRoman(1994));
    }
    public static String intToRoman(int num){

        String answer = "";

        int thousands = num/1000;

        int remainder = num%1000;

        System.out.println(thousands);
        System.out.println(remainder);


        if(thousands>= 1.0){

            double noOfThousands = Math.floor(thousands);
            int noOfThousandsAsInt = (int) noOfThousands;

            answer += "M".repeat(noOfThousandsAsInt);

        }

        int fiveHunnas = remainder/500;
        if(fiveHunnas >= 1.0){
            answer += "D".repeat(fiveHunnas);
        }

        int fiveHunnasRemainder = remainder%500;
        System.out.println(fiveHunnasRemainder);

        int oneHunnas = fiveHunnasRemainder/100;
        if(oneHunnas >= 1.0){
            answer += "C".repeat(oneHunnas);
        }
        
        int oneHunnasRemainder = fiveHunnasRemainder%100;
        System.out.println(oneHunnasRemainder);

        int fifties = oneHunnasRemainder/50;
        if(fifties >= 1.0){
            answer += "L".repeat(fifties);
        }

        int fiftiesRemainder = oneHunnasRemainder%50;
        System.out.println(fiftiesRemainder);

        int tens = fiftiesRemainder/10;
        if(tens >= 1.0){
            answer += "X".repeat(tens);
        }

        int tensRemainder = fiftiesRemainder%10;
        System.out.println(tensRemainder);

        int fives = tensRemainder/5;
        if(fives >= 1.0){
            answer += "V".repeat(fives);
        }

        int fivesRemainder = tensRemainder%5;

        int ones = fivesRemainder;
        if(ones >= 1.0){
            answer += "I".repeat(ones);
        }

        String realAnswer;
            realAnswer = answer.replace("VIIII", "IX").replace("IIII", "IV").replace("LXXXX", "XC").replace("XXXX", "XL").replace("DCCCC", "CM").replace("CCCC", "CD");
            System.out.println(realAnswer);


        return realAnswer;
        // 4: iiii -> iv
        // 9: viiii -> ix
        // 40: XXXX -> XL
        // 90: LXXXX -> XC
        // 400: CCCC -> CD
        // 900: DCCCC -> CM

    }
}
