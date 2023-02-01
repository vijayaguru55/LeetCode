package org.LeetCode;
/*Problem No.419
 * Given an m x n matrix board where each cell is a battleship 'X' or empty '.', 
 * return the number of the battleships on board.
 *Battleships can only be placed horizontally or vertically on board. In other words, 
 *they can only be made of the shape 1 x k (1 row, k columns) or k x 1 (k rows, 1 column), 
 *where k can be of any size. At least one horizontal or 
 *vertical cell separates between two battleships (i.e., there are no adjacent battleships).
 */
public class BattleShipBoard {
    public int countBattleships(char[][] board) {
        int c=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]=='X'){
                    rec(board,i,j);
                    c++;
                }
                
            }
        }
        return c;
    }

    static void rec(char[][] b,int r,int c){
        if(r<0||c<0||r>=b.length||c>=b[0].length||b[r][c]=='.')
            return;

        b[r][c]='.';
        rec(b,r+1,c);
        rec(b,r,c+1);
        rec(b,r-1,c);
        rec(b,r,c-1);
        
    }
    public static void main(String[] args) {
        char[][] board ={{'X','.','.','.'},{'.','.','.','X'},{'.','.','.','X'}};
        BattleShipBoard battleShipBoard =new BattleShipBoard();
        System.out.println(battleShipBoard.countBattleships(board));
    }
}
