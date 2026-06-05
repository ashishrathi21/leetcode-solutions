// 0974. Subarray Sums Divisible by K
// Difficulty : Medium
// Runtime    : 24 ms
// Memory     : 51.7 MB
// URL        : https://leetcode.com/problems/subarray-sums-divisible-by-k/

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        int prefixSum =0;
        int count = 0;

        for(int num : nums){
            prefixSum += num;

            int rem = prefixSum % k;

            if(rem < 0){
                rem += k;
            }

            if(map.containsKey(rem)){
                count += map.get(rem);
            }

            map.put(rem, map.getOrDefault(rem, 0)+1);
        }

        return count;
    }
}