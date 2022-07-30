public class MedianofTwoSortedArrays{
    static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length>nums2.length) 
            return findMedianSortedArrays(nums2,nums1);
        
        int n1= nums1.length;
        int n2=nums2.length;
        int low = 0;
        int high = n1;
        
        while(low<=high){
            int cut1 = (low+high)/2;
            int cut2= (n1+n2+1)/2 - cut1;
            
            int l1 = cut1 ==0 ? Integer.MIN_VALUE : nums1[cut1-1];
            int l2 = cut2 ==0 ? Integer.MIN_VALUE: nums2[cut2-1];
            
            int r1 = cut1 == n1? Integer.MAX_VALUE:nums1[cut1];
            int r2 = cut2 == n2? Integer.MAX_VALUE:nums2[cut2];
            
            //check validity
            if(l1<=r2 && l2<=r1){
                if((n1+n2)%2 ==0) 
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;  //if even
                else
                   return Math.max(l1,l2); //if odd
            } else if(l1>r2){
                high=cut1-1;
            }else{
                low=cut1+1;
            }
        }
        return 0.0;
    }
    public static void main(String args[]) {
        int arr1[] = {1,4,7,10,12};
        int arr2[] = {2,3,6,15};
        int m = arr1.length;
        int n = arr2.length;
        System.out.print("The Median of two sorted array is "+findMedianSortedArrays(arr1,arr2));
        //System.out.printf("%.5f",median(arr1,arr2));
    }   
}