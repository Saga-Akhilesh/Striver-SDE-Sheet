//Problem : https://leetcode.com/problems/sort-colors/
import java.util.*;
public class Sort012 {
    static void sortColors(int[] arr) {
        //dutch national flag algorithm
        //3 pointers
        int low=0;
        int mid=0;
        int high=arr.length-1;
        int temp;
        while(mid<=high){   //if mid crosses high pointer then loop terminates
        switch(arr[mid]){
            case 0: {
            temp=arr[low];
            arr[low]=arr[mid];
            arr[mid]=temp;
            low++;
            mid++;
            break; 
            }
            case 1: mid++;
            break;
            case 2: {
                temp=arr[mid];
            arr[mid]=arr[high];
            arr[high]=temp;
            high--;
            break;
            }
        }
    }
    }
    public static void main(String args[]){
        int arr[]={2,0,2,1,1,0};
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
}