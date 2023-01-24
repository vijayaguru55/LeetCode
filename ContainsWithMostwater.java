package org.LeetCode;
/*Problem No.9
 * You are given an integer array height of length n. There are n vertical lines drawn such that 
 * the two endpoints of the ith line are (i, 0) and (i, height[i]).
 * Find two lines that together with the x-axis form a container, 
 * such that the container contains the most water.
 * Return the maximum amount of water a container can store. 
 * Notice that you may not slant the container.
 */
public class ContainsWithMostwater {
    public int maxArea(int[] height) {
        
        int water = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            int h = Math.min(height[i], height[j]);
            water = Math.max(water, (j - i) * h);
            while (height[i] <= h && i < j) i++;
            while (height[j] <= h && i < j) j--;
        }
        return water;
        
    }
    public static void main(String[] args) {
        int[]  container ={1,8,6,2,5,4,8,3,7};
        ContainsWithMostwater containsWithMostwater = new ContainsWithMostwater();
        System.out.println(containsWithMostwater.maxArea(container));
    }
}
