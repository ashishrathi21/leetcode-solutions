// 0122. Best Time to Buy and Sell Stock II
// Difficulty : Medium
// Runtime    : 0 ms
// Memory     : 46.2 MB
// URL        : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/

class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for(int i=1; i<prices.length; i++){
            if(prices[i] > prices[i-1]){
                profit += prices[i] - prices[i-1];
            }
        }

        return profit;
    }
}