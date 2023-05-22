package may;

import java.util.Arrays;

public class MultiplyTheNumber {
    public static void main(String[] args) {
        System.out.println(multiply( 10));
        System.out.println(multiply2( 10));
    }
    public static int multiply(int n) {
        int counter = 1;
        int m =n/10;
        while(m !=0){
            m= m/10;
            counter++;
        }
       int result= (int) (n * Math.pow( 5, counter));
        return result;
    }
    public static int multiply2(int n) {
        String m = String.valueOf(n);

        return (int) (n * Math.pow(5,m.length() ));
    }
}





