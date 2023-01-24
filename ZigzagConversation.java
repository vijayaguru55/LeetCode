package org.LeetCode;
/* 6.Problem No.6
 * The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

 *   P   A   H   N
 *   A P L S I I G
 *   Y   I   R
 *   And then read line by line: "PAHNAPLSIIGYIR"
 *   
 *   Write the code that will take a string and make this conversion given a number of rows:
 */
public class ZigzagConversation {
    public String convert(String s, int numRows) {
        if(numRows<=1)return s;
        StringBuilder[] sb=new StringBuilder[numRows];
        for(int i=0;i<sb.length;i++){
            sb[i]=new StringBuilder("");//init every sb element *important steps!!!
        }
        int incre=1;
        int index=0;
        for(int i=0;i<s.length();i++){
            sb[index].append(s.charAt(i));
            if(index==0){incre=1;}
            if(index==numRows-1){incre=-1;}
            index+=incre;
        }
        String re="";
            for(int i=0;i<sb.length;i++){
                re+=sb[i];
             }
            return re.toString();
        }
    public static void main(String[] args) {
        ZigzagConversation zigzagConversation = new ZigzagConversation();
        String string = "PAYPALISHIRING";
        System.out.println(zigzagConversation.convert(string, 3));
    }
}
