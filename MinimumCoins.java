import java.util.*;
public class MinimumCoins{
    static List<Integer> minPartition(int N)
    {
       List <Integer> ans= new ArrayList<>();
       int arr[]={1,2,5,10,20,50,100,200,500,2000};
       int n=arr.length;
       for(int i=n-1;i>=0;i--){
           while(N>=arr[i]){
               N-=arr[i];
               ans.add(arr[i]);
           }
       }
       return ans;
    }
}