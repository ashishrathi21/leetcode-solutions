// 1186. Maximum Subarray Sum with One Deletion
// Difficulty : Medium
// Runtime    : 7 ms
// Memory     : 56.1 MB
// URL        : https://leetcode.com/problems/maximum-subarray-sum-with-one-deletion/

class Solution {
    public int maximumSum(int[] nums) {

        int noDelete = nums[0];
        int oneDelete = Integer.MIN_VALUE;
        int ans = nums[0];

        for(int i=1; i<nums.length; i++){

            int prevNoDelete = noDelete;
            int prevOneDelete = oneDelete;

            noDelete = Math.max(noDelete+nums[i], nums[i]);

            int v2;
            if(prevOneDelete == Integer.MIN_VALUE)
                v2 = nums[i];
            else
                v2 = prevOneDelete + nums[i];

            oneDelete = Math.max(v2, prevNoDelete);

            ans = Math.max(ans, Math.max(oneDelete, noDelete));
        }
        return ans;
    }
}