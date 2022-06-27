//problem: https://leetcode.com/problems/set-matrix-zeroes/
import java.util.*;
public class SetMatrixZeroes{
static void setZeroes(int[][] matrix) {
    boolean col0=true;
    int rows=matrix.length, columns=matrix[0].length;
    for(int i=0;i<rows;i++){
        if(matrix[i][0]==0) col0=false;
        for(int j=1;j<columns;j++)
            if(matrix[i][j]==0)
                matrix[i][0]=matrix[0][j]=0;   //while traversing in the matrix (not the dummy part) then if u find zero then set zeroes to both dummy row and column of that index
        }
    //now traverse from backside
    for(int i=rows-1;i>=0;i--){
        for(int j=columns-1;j>=1;j--)
            if(matrix[i][0]==0 || matrix[0][j]==0)
                matrix[i][j]=0;     //if u find 1 while checking from backside then check its dummy row and dummy column of that row and column if u find zero in the dummies then change this 1 to 0
        if(col0==false) matrix[i][0]=0;  //if variable column is false, then change zeroth column elements to zero.
    }
}
public static void main(String args[]) {
    int arr[][] = {{1,1,1}, {1,0,1}, {1,3,1,5}};
    setZeroes(arr);
    System.out.println("The Final Matrix is ");
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr[0].length; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}
}
