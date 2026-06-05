// 0153. Find Minimum in Rotated Sorted Array
// Difficulty : Medium
// Runtime    : 0 ms
// Memory     : 44 MB
// URL        : https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

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