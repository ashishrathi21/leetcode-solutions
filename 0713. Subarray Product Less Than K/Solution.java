// 0713. Subarray Product Less Than K
// Difficulty : Medium
// Runtime    : 4 ms
// Memory     : 51.4 MB
// URL        : https://leetcode.com/problems/subarray-product-less-than-k/

class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        List<List<Integer>> list = new ArrayList<>();

        int left=0;
        int right=0;
        int mul=1;
        int count =0;
        
        if(k <= 1) return 0;

        while(right<nums.length){
            mul = mul * nums[right];

            while(mul>=k){
                mul = mul/nums[left];
                left++;
            }

            count += right-left+1;
            right ++;
        }

        return count;
    }
}