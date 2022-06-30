public class GridUniqueParts{
static int uniquePaths(int m, int n) {
    //using combinations nCr
    int N = n+m-2;     //total number of steps = (m-1) --->column wise and (n-1) ---> row wise so (m-1)+(n-1)= m+n-2;
    int R = m-1;        // for denominator , here in problem, we can take either m or n => Number of rights = no. of columns -1  or Number of downs = number of rows-1; 
    double result=1;
    for(int i=1;i<=R;i++){
        result=result*(N-R+i)/i;
    }
    return (int)result;
}
public static void main(String args[]){
    int m=3; //rows
    int n=7; //columns
    System.out.println(uniquePaths(m,n));
}
}