public class SortedArray{
    static int search(int[] arr, int target) {
        int low = 0 , high =arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(target==arr[mid]) return mid;

            //check if left half is sorted or not
            if(arr[low]<=arr[mid]){
                if(target>=arr[low] && target<=arr[mid]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }else{
                if(target>=arr[mid] && target<=arr[high]){
                    high=mid-1;
                }else{
                    low=mid+1;
                }
            }
        } return -1;
    }
    public static void main(String[] args) {
        int arr[]={4,5,6,7,0,1,2,3};
        int target=0;
        System.out.println(search(arr,target));
    }
}
