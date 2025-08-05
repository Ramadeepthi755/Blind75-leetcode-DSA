//My Profile : https://leetcode.com/u/Ramadeepthi/
//Problem : Best Time to Buy and Sell Stock
//Leetcode:https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

/*Approuch:
-first we have to find min value that will be best time to buy(buy at low)
-then have to subtract every element with min value after min element to get max profit 
-if you get max profit in one element that will be best time for selling(sell at high)
-print Profit */

/* Time Complexity : O(n)
    Space Complexity : O(1)
    */

//code
class Solution {
    public int maxProfit(int[] prices) {
        int min=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            profit=Math.max(profit,prices[i]-min);
        }
        return profit;
    }
}
