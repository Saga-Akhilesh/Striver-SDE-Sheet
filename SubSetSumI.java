import java.util.*;
public class SubSetSumI{
    static void function(ArrayList<Integer>arr,int N,int ind,int sum,ArrayList<Integer>SubsetSum){
        //base condition
        if(ind==N){
            SubsetSum.add(sum);
            return;
        }
        //if we want to pick
        function(arr,N,ind+1,sum+arr.get(ind),SubsetSum);

        //if we dont want to pick
        function(arr,N,ind+1,sum,SubsetSum);
    }
    static ArrayList<Integer> SubsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer>SubsetSum=new ArrayList<>();
        function(arr,N,0,0,SubsetSum);
        Collections.sort(SubsetSum);
        return SubsetSum;
    }
    public static void main(String[] args) {
        ArrayList < Integer > arr = new ArrayList < > ();
        arr.add(3);
        arr.add(1);
        arr.add(2);
        ArrayList < Integer > ans = SubsetSums(arr, arr.size());
        Collections.sort(ans);
        for (int i = 0; i < ans.size(); i++)
            System.out.print(ans.get(i) + " ");        
    }
}