// 2144. Minimum Cost of Buying Candies With Discount
// Difficulty : Easy
// Runtime    : 6 ms
// Memory     : 44.7 MB
// URL        : https://leetcode.com/problems/minimum-cost-of-buying-candies-with-discount/

class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        
        int count =0;
        int ans =0;
        
        for(int i=cost.length-1; i>=0; i--){
            count ++;
            
            if(count == 3){
                count = 0;
                continue ;
            }
            
            ans += cost[i];
        }
        
        return ans;
    }
}