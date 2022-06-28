//using Moore's Voting Algorithm
public class MajorityPartOne{
static int majorityElement(int[] nums) {
    int element=0;
    int count=0;
    for(int num:nums){
        if(count==0){
            element=num;
        }
        if(num==element){
            count+=1;
        }else{
            count-=1;
        }
    }
    return element;
}
public static void main(String args[]){
    int arr[]={2,2,1,1,1,2,2};
    System.out.println(majorityElement(arr));
}
}