package January;

import java.util.Scanner;

public class PalindromeNumber {


    public static void main(String[] args) {
    int y = -10;
        System.out.println(isPalindrome(y));

    }
    public static boolean palindrome(int x){
        while(x>0){
        String y= String.valueOf(x);
        for(int i = 0;i<y.length()/2;i++){
            for(int j=y.length()-1; j>y.length()/2;j--){
                if(String.valueOf(y.charAt(i)).equals(String.valueOf(y.charAt(j)))){
                    return true;
                }

            }

        }}
        return false;
    }
    public static boolean isPalindrome(int x){
        int reverse=0;
        int original=x;
        while(x>0){
            int remainder=x % 10;
            System.out.println(x);
            reverse= reverse * 10 + remainder;
            x= x/10;
        }
        return reverse == original;
    }
}
