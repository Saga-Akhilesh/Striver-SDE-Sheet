import java.util.*;
public class countInversions{
    static int mergesortandcount(int arr[],int low,int high){
        int count=0;
        if(low<high){
            int mid=(low+high)/2;
            count+=mergesortandcount(arr,low,mid);
            count+=mergesortandcount(arr,mid+1,high);
            count+=mergeandcount(arr,low,mid,high);
        }
        return count;
    }
    static int mergeandcount(int arr[],int l,int m,int r){
        int left[]=Arrays.copyOfRange(arr,l,m+1);
        int right[]=Arrays.copyOfRange(arr,m+1,r+1);
        int i=0,j=0,k=l,swaps=0;
        while(i<left.length && j< right.length){
            if(left[i]<right[j]){
                arr[k++]=arr[i++];
            }else{
                arr[k++]=arr[j++];
                swaps+=(m+1)-(l+i);
            }
        }
        while(i<left.length){
            arr[k++]=left[i++];
        }
        while(j<right.length){
            arr[k++]=right[j++];
        }
        return swaps;
    }
    public static void main(String args[]){
        int arr[]={8, 4, 2, 1};
        System.out.println(mergesortandcount(arr,0,arr.length-1));
    }
}