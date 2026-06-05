// 0209. Minimum Size Subarray Sum
// Difficulty : Medium
// Runtime    : 1 ms
// Memory     : 62 MB
// URL        : https://leetcode.com/problems/minimum-size-subarray-sum/

class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low=0;
        int high=0;
        int sum=0;
        int result=Integer.MAX_VALUE;

        while(high<nums.length){
            sum += nums[high];

            while(sum >= target){
                int len = high - low + 1;
                result = Math.min(result , len);
                sum -= nums[low];
                low++;
            }
            high++;
        }
        return result == Integer.MAX_VALUE ? 0 : result;
    }
}