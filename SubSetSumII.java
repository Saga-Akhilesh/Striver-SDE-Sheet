import java.util.*;
public class SubSetSumII{
    static void SubsetSum(int arr[],int ind, ArrayList<Integer>ds,List<List<Integer>>ans){
        ans.add(new ArrayList<>(ds));
        for(int i=ind;i<arr.length;i++){
            if(i!=ind && arr[i]==arr[i-1]) continue;   //to remove duplicates
            ds.add(arr[i]);
            SubsetSum(arr,i+1,ds,ans);
            ds.remove(ds.size()-1);
        }
    } 
    static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>ans= new ArrayList<>();
        SubsetSum(nums,0,new ArrayList<>(),ans);
        return ans;
    }
    public static void main(String args[]){
        int arr[]={1,2,2};
        System.out.println(subsetsWithDup(arr));
    }
}