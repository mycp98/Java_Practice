package leetcode;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {

        int sum = 0;

        for (int i = 0; i < s.length(); i++) {

            switch (s.charAt(i)) {
                case 'M':
                    sum += 1000;
                    break;
                case 'D':
                    sum += 500;
                    break;
                case 'C':
                    sum += 100;
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'X':
                    sum += 10;
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'I':
                    sum += 1;
                    break;
            }
            //System.out.println(i + "=" + sum);

        }
        if (s.contains("IV") || s.contains("IX")) {
            sum = sum - 2;
        }
        if (s.contains("XL") || s.contains("XC")) {
            sum = sum - 20;
        }
        if (s.contains("CD") || s.contains("CM")) {
            sum = sum - 200;
        }
        return sum;
    }
}
