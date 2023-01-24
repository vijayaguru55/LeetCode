package org.LeetCode;
/*
 *Problem NO:79
 * Given an m x n grid of characters board and a string word, return true if word exists in the grid.
 * The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are 
 * horizontally or vertically neighboring. The same letter cell may not be used more than once.
 */
public class WordSearch {
    static boolean wordSearch(String word, char[][] board, int row , int col, int position){
        if(word.length()==position)
            return true;
        
        if(position>=word.length() || row<0 || row>=board.length
        || col<0 || col>=board[0].length || board[row][col] != word.charAt(position)
        || board[row][col] == '$'){
            return false;
        }

        char temp = board[row][col];
        board[row][col]='$';

        boolean left = wordSearch(word,board,row,col-1,position+1);
        boolean right = wordSearch(word,board,row,col+1,position+1);
        boolean up = wordSearch(word,board,row-1,col-1,position+1);
        boolean down = wordSearch(word,board,row+1,col+1,position+1);

        if(left|| right||up||down)
            return true;

        board[row][col]=temp;
        return false;
    }

    public static boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(word.charAt(0)==board[i][j]){
                    if(wordSearch(word,board,i,j,0))
                        return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        char[][] board = {{'a','b','c','e'},{'s','f','c','s'},{'a','e','d','e'}};
    }
}
