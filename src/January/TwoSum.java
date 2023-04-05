package January;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    private static Scanner scan = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Whats the target?");
        int target= scan.nextInt();
        System.out.println("How many numbers to input?");
        int count = scan.nextInt();
        int[] nums = new int[count];
        System.out.println("Input the numbers9");
        for(int i =0; i< count;i++){
            nums[i]= scan.nextInt();}

        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++){
                if ((nums[i] + nums[j]) == target) {


                    return new int[]{i, j};
                }
        }
    }
        return null;
    }
}
