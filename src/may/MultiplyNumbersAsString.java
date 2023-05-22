package may;

public class MultiplyNumbersAsString {
    public static void main(String[] args) {
        System.out.println(multiplyNumbersAsString("123", "456"));
    }

    private static String multiplyNumbersAsString(String s, String s1) {
       int x = Integer.parseInt(s) ;

       int y = Integer.parseInt(s1) ;

       return String.valueOf(x * y);}
}
