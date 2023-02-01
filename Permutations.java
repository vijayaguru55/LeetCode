package org.LeetCode;

import java.util.ArrayList;
/*Problem No.46
 * Given an array nums of distinct integers, return all the possible permutations.
 * You can return the answer in any order.
 */

public class Permutations {
    public ArrayList<ArrayList<Integer>> permute(int[] nums) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        boolean[] v = new boolean[nums.length];
        ArrayList<Integer> curr = new ArrayList<>();
        
        backtrack(res,nums,curr,v);
        return res;
    }

    static void backtrack(ArrayList<ArrayList<Integer>> res,int[] nums,ArrayList<Integer> curr ,boolean[] v){
        if(curr.size()==nums.length){
            res.add(new ArrayList(curr));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(v[i]==true){
                continue;
            }
            curr.add(nums[i]);
            v[i]=true;
            backtrack(res,nums,curr,v);
            curr.remove(curr.size()-1);
            v[i]=false;
        }
    }
    public static void main(String[] args) {
        int[] orignal ={1,2,3};
        Permutations permutations = new Permutations();
        for(ArrayList<Integer>  list : permutations.permute(orignal)){
            System.out.println(list);
        }
    }
}
