package org.LeetCode;

import java.util.ArrayList;

/*Probem No.47
 * Given a collection of numbers, nums, that might contain duplicates,
 * return all possible unique permutations in any order.
 */
public class Permutations2 {
    public ArrayList<ArrayList<Integer>> permuteUnique(int[] nums) {
        ArrayList<ArrayList<Integer>> answer = new ArrayList<>();
        permut(answer,nums,0);
        return answer;
    }

    static void permut(ArrayList<ArrayList<Integer>> a,int[] n,int start){
        if(start==n.length){
            ArrayList<Integer> l = toList(n);
            if(!a.contains(l))
                a.add(l);
        }
        for(int i=start; i<n.length;i++){
            swap(n,start,i);
            permut(a,n,start+1);
            swap(n,start,i);
        }
            
    }

    static ArrayList<Integer> toList(int[] n){
        ArrayList<Integer> l = new ArrayList<>();
        for(int i: n)
            l.add(i);
        return l;
    }

    static void swap(int[] n, int a, int b){
        int t=n[a];
        n[a]=n[b];
        n[b]=t;
    }
    public static void main(String[] args) {
        int[] orignal ={1,1,2};
        Permutations2 permutations2 = new Permutations2();
        for(ArrayList<Integer>  list : permutations2.permuteUnique(orignal)){
            System.out.println(list);
        }
    }
}
