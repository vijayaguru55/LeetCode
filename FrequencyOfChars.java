package org.LeetCode;
import java.util.Arrays;
/*
 * 451. Sort Characters By Frequency
 * Given a string s, sort it in decreasing order based on the frequency of the characters.
 * The frequency of a character is the number of times it appears in the string.
 * Return the sorted string. If there are multiple answers, return any of them.
 */
public class FrequencyOfChars {
    public String frequencySort(String s) {
        String[] chars = new String[s.length()];
        StringBuilder str = new StringBuilder();
        char current;
        int index=0;
        while(s.length()>0){
            current=s.charAt(0);
            StringBuilder newStr = new StringBuilder();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)==current){
                    newStr.append(current);
                }
            }
            s=s.replaceAll(String.valueOf(current),"");
            chars[index++]=newStr.toString();
            if(s.length()==0)
                chars=Arrays.copyOfRange(chars,0,index);
        }
    return sort(chars);
    }

    static String sort(String[] s){
        int j=0;
        StringBuilder str = new StringBuilder();
        while(j<s.length){
            String m=s[j];
            int ind=0;
            for(int i=j+1;i<s.length;i++){
                if(s[i].length()>m.length()){
                    m=s[i];
                    ind=i;
                }
            }
            String st=s[j];
            s[j]=m;
            s[ind]=st;
            str.append(s[j]);
            j++;
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String a ="cccaaaa";
        FrequencyOfChars frequencyOfChars = new FrequencyOfChars();
        System.out.println(frequencyOfChars.frequencySort(a));
    }
}
