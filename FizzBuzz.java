package org.LeetCode;

import java.util.ArrayList;

import javax.swing.tree.FixedHeightLayoutCache;

/*Problem No.412
 * Given an integer n, return a string array answer (1-indexed) where:
 * answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * answer[i] == "Fizz" if i is divisible by 3.
 * answer[i] == "Buzz" if i is divisible by 5.
 * answer[i] == i (as a string) if none of the above conditions are true.
 */
public class FizzBuzz {
    public ArrayList<String> fizzBuzz(int n) {
        ArrayList<String> l = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3 ==0 && i%5==0)
                l.add("FizzBuzz");
            else if(i%3==0)
                l.add("Fizz");
            else if(i%5==0)
                l.add("Buzz");
            else
                l.add(""+(i)+"");
        }
        return l;
    }
    public static void main(String[] args) {
        int n=12;
        FizzBuzz fizzBuzz = new FizzBuzz();

        System.out.println(fizzBuzz.fizzBuzz(n));
    }
}
