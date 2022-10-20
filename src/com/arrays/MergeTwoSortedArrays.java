package com.arrays;

import java.util.Arrays;

/*
Input:
        [0, 2, 7, 10, 33, 1000];
        [-1, 0, 0, 20, 999, 15000];

Output:
        [-1, 0, 0, 0, 2, 7, 10, 20, 33, 999, 1000, 15000]
 */

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {0, 2, 7, 10, 33, 1000};
        int[] arr2 = {-1, 0, 0, 20, 999, 15000};

        System.out.println(Arrays.toString(mergeTwoSortedArrays(arr1, arr2)));
    }

    public static int[] mergeTwoSortedArrays(int[] arr1, int[] arr2) {
        int[] answer = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;

        while (i < arr1.length && j < arr2.length) {
            answer[k++] = arr1[i] < arr2[j] ? arr1[i++] : arr2[j++];
        }

        while (i < arr1.length) {
            answer[k++] = arr1[i++];
        }

        while (j < arr2.length) {
            answer[k++] = arr2[j++];
        }
        return answer;
    }
}
