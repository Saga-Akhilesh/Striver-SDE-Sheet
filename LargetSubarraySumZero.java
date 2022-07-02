import java.util.*;
public class LargetSubarraySumZero{
static int maxLen(int arr[], int n)
    {
        HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
        int sum=0;
        int maxlength=0;   //length of largest subarray
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==0){
                maxlength=i+1;   //if sum became zero at 1st index then maxlength= 1+1 =2 becuase we know that array starts with 0
            }
            else{
                if(map.containsKey(sum)){
                    maxlength=Math.max(maxlength,i-map.get(sum));   //i-map.get(sum)  ---> it is current index of that particular sum - the index which is in hashmap fo the sum.
                }
            else{
                map.put(sum,i);
            }
        }
        }
        return maxlength;
    }
    public static void main(String args[]){
        int arr[]={15,-2,2,-8,1,7,10,23};
        int n=8;
        System.out.println(maxLen(arr,n));
    }
}