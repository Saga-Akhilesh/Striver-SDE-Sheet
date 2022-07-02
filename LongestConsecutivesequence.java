import java.util.*;
public class LongestConsecutivesequence {
    static int longestConsecutive(int[] nums) {
        HashSet <Integer>set=new HashSet<Integer>();
        for(int num:nums){
            set.add(num);
        }
        int longestsequence=0;
        for(int num:nums){
            if(!set.contains(num-1)){
                int currentnum=num;
                int currentsequence=1;
                
            while(set.contains(currentnum+1)){
                currentnum+=1;
                currentsequence+=1;
            }
                longestsequence=Math.max(longestsequence,currentsequence);
        }
    }
        return longestsequence;
}
public static void main(String args[]){
    int arr[]={100,4,200,1,3,2};
    System.out.println(longestConsecutive(arr));
}
}