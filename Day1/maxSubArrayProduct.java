//Problem:https://leetcode.com/problems/maximum-product-subarray/
class maxSubArrayProduct {
    static int maxProduct(int[] nums) {
		int max = nums[0];
		int product = 1;

		for(int i = 0; i<nums.length; i++){
			product *= nums[i];
			max = Math.max(max, product);
			if(product == 0) product = 1;
		}

		product = 1;

		for(int i = nums.length-1; i>=0; i--){
			product *= nums[i];
			max = Math.max(max, product);
			if(product == 0) product = 1;
		}

		return max;
	}
    public static void main(String args[]){
        int arr[]={2,3,-2,4};
        System.out.println( maxProduct(arr));
    }
}
