import java.util.*;
public class MajorityElementII{
    static List<Integer> majorityElement(int[] nums) {
        int count1=0,count2=0,num1=-1,num2=-1, len=nums.length;
        for(int i=0;i<len;i++){
            if(num1==nums[i]){
                count1++;
            }else if(num2==nums[i]){
                count2++;
            }else if(count1==0){
                num1=nums[i];
                count1=1;
            }else if(count2==0){
                num2=nums[i];
                count2=1;
            }else{
                count1--;
                count2--;
            }
        }
        List<Integer> ans=new ArrayList<>();
         count1=0;
         count2=0;
        for(int i=0;i<len;i++){
            if(num1==nums[i]){
                count1++;
            }else if(num2==nums[i]){
                count2++;
            }
        }
        if(count1>len/3)
            ans.add(num1);
        if(count2>len/3)
            ans.add(num2);
            return ans;
    }
    public static void main(String args[]){
        int arr[]={1,1,1,1,3,3,2,2,2,2};
        System.out.println(majorityElement(arr));
    }
}