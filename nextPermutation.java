import java.util.*;
public class nextPermutation{
    static void next(int[] nums) {
        if(nums==null || nums.length-1==0) return;
        int i =nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]) i--;
        if(i>=0){
            int j=nums.length-1;
            while(nums[i]>=nums[j]) j--;
            swap(nums,i,j);
        }
        reverse(nums,i+1,nums.length-1);
    }
    static void swap(int []nums,int i , int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    static void reverse(int []nums,int i,int j){
        while(i<j){
            swap(nums,i++,j--);
        }
    }
    public static void main(String args[]){
        int arr[]={1,1,5};
        next(arr);
        System.out.println(Arrays.toString(arr));
    }
}