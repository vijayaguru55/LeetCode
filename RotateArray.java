package org.LeetCode;

import java.util.Arrays;

/*
 *Problem No:189
 * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
 */
public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
      // No. of rotations
      k = k % n;
      int i, j;
      // Reverse last k numbers
      for (i = n - k, j = n - 1; i < j; i++, j--) {
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
      }
      // Reverse the first n-k terms
      for (i = 0, j = n - k - 1; i < j; i++, j--) {
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
      }
      // Reverse the entire array
      for (i = 0, j = n - 1; i < j; i++, j--) {
          int temp = nums[i];
          nums[i] = nums[j];
          nums[j] = temp;
      }
  }

  public static void main(String[] args) {
    int[] array = {1,2,3,4,5,6,6,7,8,};
    int times =3;
    rotate(array, times);
    System.out.println(Arrays.toString(array));
  }
}
