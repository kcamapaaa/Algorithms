package com.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
Input = [2, 7, 11, 15]
Output = [0, 1]
 */

class ReturnTwoIndexesOfTargetSumInArray {
    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int sum = 9;
        System.out.println(Arrays.toString(twoSum(arr, sum)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> diffMap = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i];
            if(!diffMap.containsKey(nums[i])) {
                diffMap.put(difference, i);
            } else {
                result[0] = diffMap.get(nums[i]);
                result[1] = i;
            }
        }
        return result;
    }
}
