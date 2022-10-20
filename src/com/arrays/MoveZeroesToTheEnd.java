package com.arrays;
/*
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
*/

public class MoveZeroesToTheEnd {

    public static void main(String[] args) {

    }

    public static void moveZeroes(int[] nums) {
        int leftPointer = 0;

        for (int rightPointer = 0; rightPointer < nums.length; rightPointer++) {
            if(nums[rightPointer] != 0) {
                int temp = nums[leftPointer];
                nums[leftPointer] = nums[rightPointer];
                nums[rightPointer] = temp;
                leftPointer++;
            }
        }
    }
}
