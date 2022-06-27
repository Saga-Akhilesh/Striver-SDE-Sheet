//Problem: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
public class Stocks{
static int maxProfit(int[] prices) {
    int minimal = Integer.MAX_VALUE;
    int profit = 0;
    for(int i=0;i<prices.length;i++){
        if(prices[i]<minimal){
            minimal=prices[i];
        }else if(prices[i]-minimal>profit){
            profit =prices[i]-minimal;
        }
    }
    return profit;
}
public static void main(String args[]){
    int arr[]={7,1,5,3,6,4};
    System.out.println(maxProfit(arr));
}
}