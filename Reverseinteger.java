package org.LeetCode;
/*
 * Problem No.7 
 * Reverse Integer
 * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
 * 
 * Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */
public class Reverseinteger {
    public int reverse(int x) {
        int a,b=0,c=x;

        int prev=0;
        int l=String.valueOf(x).length();
    
       for(int i=0;i<l && x!=0;i++){
            a=x%10;
            b=(b*10)+a;
            if((b-a)/10!=prev)
                return 0;
            prev=b;
            x=x/10;
        }
        return b;
    }
    public static void main(String[] args) {
        int original = 2341;
        Reverseinteger reverseinteger = new Reverseinteger();
        System.out.println(reverseinteger.reverse(original));
    }
}
