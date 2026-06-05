// 1004. Max Consecutive Ones III
// Difficulty : Medium
// Runtime    : 4 ms
// Memory     : 52.1 MB
// URL        : https://leetcode.com/problems/max-consecutive-ones-iii/

class Solution {
    public int longestOnes(int[] nums, int k) {
        int low = 0;
        int high = 0;
        int zeroCount = 0;
        int maxLen = 0;

        while(high < nums.length){
            if(nums[high]==0){
                zeroCount++;
            }

            while(zeroCount > k){
                if(nums[low]==0){
                    zeroCount--;
                }
                low++;
            }
            int len = high - low + 1;
            maxLen = Math.max(maxLen, len);
            high++;
        }
        return maxLen;
    }
}