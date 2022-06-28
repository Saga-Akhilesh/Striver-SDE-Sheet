public class searchinMatrix{
static boolean searchMatrix(int[][] matrix, int target) {
    //using binary search
    if(matrix.length==0) return false;
    int n=matrix.length;   //row
    int m= matrix[0].length; //column
    int low=0;
    int high= (n*m)-1;
    while(low<=high){
        int mid=low+(high-low)/2;
        if(matrix[mid/m][mid%m]==target){
            return true;
        }else if(matrix[mid/m][mid%m]>target){
            high=mid-1;
          }else{
            low=mid+1;
        }
    }
    return false;
}
public static void main(String args[]){
        int arr[][] = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        System.out.println(searchMatrix(arr,90));
}
}