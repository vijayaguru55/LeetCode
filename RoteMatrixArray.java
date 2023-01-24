package org.LeetCode;
/*
 *Problem No:48.
 * You are given an n x n 2D matrix representing an image, 
 * rotate the image by 90 degrees (clockwise).
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. 
 * DO NOT allocate another 2D matrix and do the rotation.
 */
public class RoteMatrixArray {
    public static void rotate(int[][] matrix) {
        for(int i=0;i<matrix.length-1;i++){
            for(int j=i;j<matrix[i].length;j++){
                int k =matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=k;
            }
        }
        int c=0;
        int j=matrix[0].length-1;
        while(c<(matrix.length)/2){
            
            for(int i=0;i<matrix.length;i++){
            
            int k=matrix[i][c];
            matrix[i][c]=matrix[i][j];
            matrix[i][j]=k;
        }
        j--;
        c++;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(matrix);
        for (int[] is : matrix) {
            for (int i : is) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
