package org.LeetCode;

import java.util.ArrayList;

/*problem No.22
 * Given n pairs of parentheses, 
 * write a function to generate all combinations of well-formed parentheses.
 */
public class Generateparanthesis {
    public ArrayList<String> generateParenthesis(int n) {
        ArrayList<String> res = new ArrayList();
        findAll("(",1,0,res,n);

        return res;
    }

    void findAll(String current,int op , int cl , ArrayList<String> res, int n){
        if(current.length()==2*n){
            res.add(current);
            return;
        }
        if(op<n)
        findAll(current+"(", op+1,cl,res,n);
        if(cl<op)
        findAll(current+")",op,cl+1,res,n);
    }
    public static void main(String[] args) {
        int combinations = 4;
        Generateparanthesis generateparanthesis = new Generateparanthesis();
        ArrayList<String> paranthesis = generateparanthesis.generateParenthesis(combinations);
        System.out.println(paranthesis);
    }
}
