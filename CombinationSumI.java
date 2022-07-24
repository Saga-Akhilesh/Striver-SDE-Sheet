import java.util.ArrayList;
import java.util.List;
public class CombinationSumI{
     static void combinations(int ind , int arr[],int target,List<List<Integer>>ans,List<Integer>ds){
        //base condition
        if(ind==arr.length){
            if(target==0){
                ans.add(new ArrayList<>(ds));
            } return;
        }
        if(arr[ind]<=target){ //pick
            ds.add(arr[ind]);
            combinations(ind,arr,target-arr[ind],ans,ds);
            ds.remove(ds.size()-1);
        }
        combinations(ind+1,arr,target,ans,ds);  //not pick
    }
    static List<List<Integer>> combinationSum(int arr[],int target) {
    List<List<Integer>>ans=new ArrayList<>();
    combinations(0,arr,target, ans, new ArrayList<>());
    return ans;
   } 
   public static void main(String args[]){
    int arr [] = new int[]{2,3,6,7};
    int target=7;
    System.out.println(combinationSum(arr,target));
   }
}