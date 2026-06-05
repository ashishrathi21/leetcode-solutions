// 0154. Find Minimum in Rotated Sorted Array II
// Difficulty : Hard
// Runtime    : 0 ms
// Memory     : 44.9 MB
// URL        : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/

class Solution {
    public int findMin(int[] nums) {
         int min = nums[0];

      for(int i=0; i<nums.length; i++){
        if(nums[i]<min){
            min = nums[i];
        }
      }   
      return min;
    }
}