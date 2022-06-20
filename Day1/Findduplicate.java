//Tortoise method: Slow and Fast pointers
public class Findduplicate{
    static int duplicate(int arr[]){
        int slow=arr[0];
        int fast=arr[0];
        do{
            slow=arr[slow];
            fast=arr[arr[fast]];
        }while(slow!=fast);  //unless and until both collide with each other

        fast=arr[0];
        while(slow!=fast){
            slow=arr[slow];
            fast=arr[fast];
        }
        return slow;
    }
    //using Cycle sort
    
    //public int findDuplicate(int[] nums) {
      //  int i = 0;
       // while (i <  nums.length) {
       //     if ( nums[i] != i + 1) {
       //       int correct =  nums[i] - 1;
       //     if ( nums[i] !=  nums[correct]) {
      //       swap( nums, i , correct);
      //  } else {
     //           return  nums[i];
    //    }
    //  } else {
       //         i++;
         //   }
       // }
        //return -1;
   // }

   // static void swap(int[]  nums, int first, int second) {
     //   int temp =  nums[first];
       //  nums[first] =  nums[second];
        // nums[second] = temp;
  //  }
//}
    public static void main(String args[]){
        int arr[]={3,1,3,4,2};
        System.out.println(duplicate(arr));
    }
}