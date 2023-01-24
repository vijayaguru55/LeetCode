package org.LeetCode;

import java.util.HashSet;
import java.util.Set;

/*Problem No.3
 * Given a string s, find the length of the longest substring
 * without repeating characters.
 */
public class LongestSubStrting {
    public int lengthOfLongestSubstring(String s) {
        if(s==null || s.equals(""))
           return 0;
           Set<Character> uniqueChars = new HashSet<>();
           int start=0,end=0,maxLength=0;
           while(end<s.length()){
               if(uniqueChars.add(s.charAt(end))){
                   end++;
                   maxLength=Math.max(maxLength,uniqueChars.size());
               }else{
                   uniqueChars.remove(s.charAt(start++));
   
               }
           }
           return maxLength;
       }
    public static void main(String[] args) {
        String s1="abcabcacbb";
        LongestSubStrting longestSubStrting = new LongestSubStrting();
        System.out.println(longestSubStrting.lengthOfLongestSubstring(s1));
    }
}
