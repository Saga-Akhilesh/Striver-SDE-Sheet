import java.util.*;
public class TwoSumProblem{
    static int[] twoSum(int[] nums, int target) {
        int result[]=new int[2];  //new array of size=2
        //using hashmap
        Map<Integer,Integer>map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){   //checking if the target-nums[i] element exits in hashtable or not
                       result[1]=i;  //index which is pointed by pointer currently
                       result[0]=map.get(target-nums[i]);
            }
            //hashtable doesnt contain target-nums[i] element then
            map.put(nums[i],i);
        }
      return result;
    }
}