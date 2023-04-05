package January;

import java.util.Arrays;

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] arr= {0,0,1,1,1,2,2,3,3,4,5};
        System.out.println(removeDuplicates(arr));
    }


    public static int removeDuplicates(int[] nums){
        int index=1;
        for(int i=1; i< nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[index]=nums[i];
                index++;
            }

        }
       // System.out.println(Arrays.toString(nums));
        return index;
    }
}
