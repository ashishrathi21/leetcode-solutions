// 0724. Find Pivot Index
// Difficulty : Easy
// Runtime    : 1 ms
// Memory     : 47.1 MB
// URL        : https://leetcode.com/problems/find-pivot-index/

class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0, sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            int right = sum - left - nums[i];

            if (left == right) {
                return i;
            }

            left += nums[i];
        }

        return -1;
    }
}