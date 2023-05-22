package February;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Number2BinaryTest {
    @Test
    public void testThatMethodNumberToBinaryIsWorking() {
        int number = 234;
        String result = Number2Binary.numberConversion(number);
        assertEquals("11011", result);
    }

    @Test
    public void testThatMethodBinaryToNumberIsWorking() {
        String binary = "1101";
        int result = Number2Binary.binaryConversion(binary);
        assertEquals(27, result);
    }
    @Test
    public void testThatMethodIntersectionSearchWorks(){
        int[][] nums = {{3,1,2,4,5},{1,2,3,4},{3,4,5,6}};
        List<Integer> list = Intersection.intersectionSearch(nums);
        assertEquals(2, list.size());
        assertTrue(list.contains(3));
        assertTrue(list.contains(4));

    }
    @Test
    public void testThatMethodIntersectionDifferenceWorks(){
        int[] nums1 = {3,1,2,4,5};
        int[] nums2 = {1,2,3,4};
        var list = Intersection.intersectionDifference(nums1, nums2);
        assertEquals(2,list.size());
        System.out.println(list.get(0).toString());
        System.out.println(list.get(1).toString());


}}