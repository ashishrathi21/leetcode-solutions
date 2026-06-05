// 0560. Subarray Sum Equals K
// Difficulty : Medium
// Runtime    : 25 ms
// Memory     : 48.5 MB
// URL        : https://leetcode.com/problems/subarray-sum-equals-k/

class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer, Integer> freq = new HashMap<>();

        freq.put(0, 1); // empty prefix sum ek baar already exist karta hai 

        int sum = 0;
        int resultCount = 0;

        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            int question = (sum-k);

            resultCount += freq.getOrDefault(question,0);

            freq.put(sum, freq.getOrDefault(sum, 0)+1);
        }

        return resultCount;
    }
}