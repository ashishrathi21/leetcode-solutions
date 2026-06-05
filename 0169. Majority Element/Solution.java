// 0169. Majority Element
// Difficulty : Easy
// Runtime    : 13 ms
// Memory     : 52.6 MB
// URL        : https://leetcode.com/problems/majority-element/

class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            freq.put(nums[i], freq.getOrDefault(nums[i] , 0)+ 1);
        }

        int maxFreq = 0;
        int ans = -1;

         for(int key : freq.keySet()){

            if(freq.get(key) > maxFreq){
                maxFreq = freq.get(key);
                ans = key;
            }
        }

        return ans;
    }
}