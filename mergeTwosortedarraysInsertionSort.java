import java.util.Arrays;
 
class mergeTwosortedarraysInsertionSort
{
    public static void merge(int[] X, int[] Y)
    {
        int m = X.length;
        int n = Y.length;
        for (int i = 0; i < m; i++)
        {
            if (X[i] > Y[0])
            {
                // swap `X[i] with `Y[0]`
                int temp = X[i];
                X[i] = Y[0];
                Y[0] = temp;
 
                int first = Y[0];
 
                // move `Y[0]` to its correct position to maintain the sorted
                // order of `Y[]`. Note: `Y[1…n-1]` is already sorted
                int k;
                for (k = 1; k < n && Y[k] < first; k++) {
                    Y[k - 1] = Y[k];
                }
 
                Y[k - 1] = first;
            }
        }
    }
 
    public static void main (String[] args)
    {
        int[] X = { 1, 4, 7, 8, 10 };
        int[] Y = { 2, 3, 9 };
 
        merge(X, Y);
 
        System.out.println("X: " + Arrays.toString(X));
        System.out.println("Y: " + Arrays.toString(Y));
    }
}