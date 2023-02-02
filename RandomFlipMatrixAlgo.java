package org.LeetCode;

import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    int m,n;
    ArrayList<String> arr;
    public Solution(int m, int n) {
        arr=new ArrayList<>();
        this.m=m;
        this.n=n;
    }
    
    public int[] flip() {
        int i=(int)(Math.random()*(m));
        int j=(int)(Math.random()*(n));
        String s=i+"$"+j;
        while(arr.contains(s)){
        i=(int)(Math.random()*(m));
        j=(int)(Math.random()*(n));
        
        s=i+"$"+j;
        }
        arr.add(s);
        return new int[]{i,j};
    }
    
    public void reset() {
        arr.clear();
    }
}
public class RandomFlipMatrixAlgo {
    public static void main(String[] args) {
        Solution solution = new Solution(3, 1);
        System.out.println(Arrays.toString(solution.flip()));
        System.out.println(Arrays.toString(solution.flip()));
        System.out.println(Arrays.toString(solution.flip()));
        solution.reset();
        System.out.println(Arrays.toString(solution.flip()));
    }
}
