// 1749. Maximum Absolute Sum of Any Subarray
// Difficulty : Medium
// Runtime    : 8 ms
// Memory     : 67 MB
// URL        : https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray/

class Solution {
    public int maxSum(int[] nums){
        int bestEnding = nums[0];
        int ans = nums[0];

        for(int i=1; i<nums.length; i++){
            int v1 = bestEnding + nums[i];
            int v2 = nums[i];

            bestEnding = Math.max(v1, v2);
            ans = Math.max(ans, bestEnding);
        }
        return ans;
    }

    public int minSum(int[] nums){
        int bestEnding = nums[0];
        int ans = nums[0];

        for(int i=1; i<nums.length; i++){
            int v1 = bestEnding + nums[i];
            int v2 = nums[i];

            bestEnding = Math.min(v1, v2);
            ans = Math.min(ans, bestEnding);
        }
        return ans;
    }

    public int maxAbsoluteSum(int[] nums) {
        int maxAbs = Math.abs(maxSum(nums));
        int minAbs = Math.abs(minSum(nums));

        int res = Math.max(maxAbs, minAbs);

        return res;
    }
}