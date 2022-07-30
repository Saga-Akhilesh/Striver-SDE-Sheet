public class KthElementInSortedArrays  {
    static long kthElement( int arr1[], int arr2[], int n, int m, int k) {
       
       if(arr2.length<arr1.length)
        return kthElement(arr2,arr1,n,m,k);
        
        int n1=arr1.length;
        int n2=arr2.length;
        
        int low=Math.max(0,k-n2);
        int high=Math.min(n1,k);
        
        while(low<=high){
            int cut1=low+(high-low)/2;
            
            int cut2=k-cut1;
           
            
            int left1=(cut1==0)?Integer.MIN_VALUE:arr1[cut1-1];
            int left2=(cut2==0)?Integer.MIN_VALUE:arr2[cut2-1];
            
            int right1=(cut1==n1)?Integer.MAX_VALUE:arr1[cut1];
            int right2=(cut2==n2)?Integer.MAX_VALUE:arr2[cut2];
            
            if(left1<=right2&&left2<=right1){
                return (long)Math.max(left1,left2);
                
            }
            else if(left1>right2)
            high=cut1-1;  //moving towards left && deleting right half
            else
            low=cut1+1;    //moving towards right && deleting left half
        }
        return 0;
    }
    public static void main(String args[]){
        int array1[] = {2,3,6,7,9};
    int array2[] = {1,4,8,10};
    int m = array1.length;
    int n = array2.length;
    int k = 5;
    System.out.println("The element at the kth position in the final sorted array is "+kthElement(array1,array2,m,n,k));
    }
}