package February;

import java.util.*;

public class Intersection {
    private static int[] freq = new int[10];

    public static List<Integer> intersectionSearch(int[][] nums) {
        List<Integer> list = new ArrayList<>();
        for (int[] num : nums) {
            for (int i : num) {
                ++freq[i];
                if (freq[i] == nums.length) {
                    list.add(i);
                }
            }

        }
        return list;
    }

    public static List intersectionDifference(int[] nums3, int[] nums4) {
        List<Integer> newNum1 = new ArrayList<>();
        List<Integer> newNum2 = new ArrayList<>();
        List<List<Integer>> answer = new ArrayList<>();

        for (int i:nums3) {newNum1.add(i);}
        for (int i:nums4) {newNum2.add(i);}

        Set<Integer> num1Set = new HashSet<>(newNum1);
        Set<Integer> num2Set = new HashSet<>(newNum2);

        num1Set.removeAll(num2Set);
        newNum1.forEach(num2Set::remove);


        List<Integer> newResult1 = new ArrayList<>(num1Set);
        List<Integer> newResult2 = new ArrayList<>(num2Set);


        answer.add(newResult1);
        answer.add(newResult2);
        return answer;
    }

}