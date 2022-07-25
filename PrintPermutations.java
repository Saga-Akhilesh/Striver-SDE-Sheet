import java.util.*;
public class PrintPermutations{
    static void permutations(int arr[],ArrayList<Integer>ds,boolean freq[],List<List<Integer>>ans){
        if(ds.size()==arr.length){
            ans.add(new ArrayList<>(ds));
            return ;
        }
        for(int i=0;i<arr.length;i++){
            if(!freq[i]){
                freq[i]=true;
                ds.add(arr[i]);
                permutations(arr,ds,freq,ans);
                ds.remove(ds.size()-1);
                freq[i]=false;
            }
        }
    }

    static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>ans = new ArrayList<>();
        ArrayList<Integer>ds = new ArrayList<>();
        boolean freq[]=new boolean[nums.length];
        permutations(nums,ds,freq,ans);
        return ans;
    }
    public static void main(String args[]){
        int arr[]={1,2,3};
        System.out.println(permute(arr));
    }

}