import java.util.*;
public class FourSumProblem {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> res = new  ArrayList<List<Integer>>();
        if(nums==null || nums.length ==0){
            return res;
        }
        int n=nums.length;
        Arrays.sort(nums); //nlogn
        for(int i =0 ;i<n;i++){
            for(int j =i+1;j<n;j++){
                int target2 = target - (nums[i]+nums[j]);  //remaining sum
                //for remaining sum, take two pointers
                int left = j+1;
                int right = n-1;
                while(left<right){
                    int two_sum = nums[left]+nums[right];
                    if(two_sum <target2){
                        left++;
                    } else if(two_sum>target2){
                        right--;
                    } else{   //here if both above conditions are not satisfied then we got answer so add them in the list
                        List <Integer> foursum = new ArrayList<>();
                        foursum.add(nums[i]);
                        foursum.add(nums[j]);
                        foursum.add(nums[left]);   //2rd index in list
                        foursum.add(nums[right]);  //3rd index in list
                        res.add(foursum);   // add in result;
                            //now left pointer should jump on duplicates and land on unique number by comparing present element and element in list at 2nd index because the same element is there in list 
                            while(left <right && nums[left]==foursum.get(2)) ++left;
                            //now right pointer should jump on duplicates and land on unique number by comparing present element and element in list at 2nd index because the same element is there in list 
                           while(left<right && nums[right]==foursum.get(3)) --right;
                    }
                }
                //now j should over the duplicates and land on unique number
                    while(j+1<n && nums[j+1]==nums[j]) ++j;
            }
            //now i should over the duplicates and land on unique number
            while(i+1 <n && nums[i+1]==nums[i]) ++i;
        }
        return res;
    }
    
}