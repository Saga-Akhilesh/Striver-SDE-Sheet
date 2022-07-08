public class MaxConsecutiveOnes{
    static int findMaxConsecutiveOnes(int arr[]){
        int counter=0;
        int maxi=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                counter++;
            }else{
                counter=0;
            }
            maxi=Math.max(counter,maxi);
        }
        return maxi;
    }
    public static void main(String args[]){
        int arr[]={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }
}