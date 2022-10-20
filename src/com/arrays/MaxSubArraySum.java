package com.arrays;

    /*
    Input: [-2, 1, -3, 4, -1, 2, 1, -5, 4]
    Output: 6
     */

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(getSubArray(array));
    }

    public static int getSubArray(int[] arr) {
        int currentMax = arr[0];
        int resultMax = currentMax;

        for (int i = 1; i < arr.length; i++) {
            currentMax = Math.max(currentMax + arr[i], arr[i]);
            resultMax = Math.max(resultMax, currentMax);
        }
        return resultMax;
    }
}
