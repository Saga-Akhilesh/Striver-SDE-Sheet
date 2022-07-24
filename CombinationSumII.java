import java.util.*;
public class CombinationSumII{
    static void combinations(int arr[],int target,int ind,List<List<Integer>>ans,List<Integer>ds){
        //base condition
        if(target==0){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]==arr[i-1]) continue;
            if(arr[i]>target) break;
            ds.add(arr[i]);
            combinations(arr,target-arr[i],i+1,ans,ds);
            ds.remove(ds.size()-1);
        }
    }
    static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>>ans=new ArrayList<>();
        combinations(candidates,target,0,ans,new ArrayList<>());
        return ans;
    }
    public static void main(String args[]){
        int candidates[]={10,1,2,7,6,1,5};
        int target= 8;
        System.out.println(combinationSum2(candidates,target));

    }
}