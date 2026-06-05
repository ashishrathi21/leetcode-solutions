// 0918. Maximum Sum Circular Subarray
// Difficulty : Medium
// Runtime    : 6 ms
// Memory     : 51.4 MB
// URL        : https://leetcode.com/problems/maximum-sum-circular-subarray/

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sumOfArray = nums[0];

        int bestEndingMax = nums[0];
        int ansMax = nums[0];

        int bestEndingMin = nums[0];
        int ansMin = nums[0];

        for(int i=1; i<nums.length; i++){

            int num = nums[i];

            bestEndingMax = Math.max(bestEndingMax+num, num);
            ansMax = Math.max(ansMax, bestEndingMax);

            bestEndingMin = Math.min(bestEndingMin+num, num);
            ansMin = Math.min(ansMin, bestEndingMin);

            sumOfArray += num;
        }

        if(ansMax < 0){
            return ansMax;
        }

        return Math.max(ansMax, sumOfArray - ansMin);
    }
}