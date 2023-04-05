package February;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Number2Binary {

    public static String numberConversion(int number) {
        int[] binary = new int[10];
        int i = 0;
        int num = number;
        StringBuilder result = new StringBuilder();
        while (num != 0) {
            binary[i] = num % 2;
            num /= 2;
            i++;
        }

        for (int j = i - 1; j >= 0; j--) {

           result =  result.append(binary[j]);
            }
        return result.toString();
    }


    public static void numberConversion2(int number) {
        List<Integer> binary2 = new ArrayList<>();
        int i = 0;
        int num = number;
       // String number1 = String.valueOf(num);
        while (num != 0) {
            binary2.add(num % 2);
            num /= 2;
            i++;
        }
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binary2.get(j));
        }
    }

    public static void numberConversion3(int number) {

        int i = 0;
        int num = number;
        while (num != 0) {
            String number1 = String.valueOf(num % 2);
            num /= 2;
            i++;
            System.out.print(number1);
        }

    }

    public static int binaryConversion(String binary) {
        int num =0;
        int j=0;
        int i = binary.length()-1;
        while (i >=0 ) {
            int result = (int)(Math.pow(2, i)* Integer.parseInt(String.valueOf(binary.charAt(j))));
            num += result;
               i--;
               j++;
        }

        return num;
    }
}

