package day30_ArrayList;

import java.util.Arrays;

public class Sum_Of_Digits {
    public static void main(String[] args) {

        String str = "a1b2c3";
        char[] arr =    str.toCharArray();

        System.out.println(Arrays.toString(arr));

        int sum = 0;
        for (char each : arr){
            /*
            boolean is_digit = each >= 48 && each <= 57;
            if (is_digit){
                sum += Integer.parseInt("" + each);     // <-- become String after "" +
            }
             */

        if (Character.isDigit(each)){
            sum += Integer.parseInt("" + each);
        }


        }

        boolean a = Character.isAlphabetic('A');



        System.out.println(sum);




    }

}
