// 0026. Remove Duplicates from Sorted Array
// Difficulty : Easy
// Runtime    : 1 ms
// Memory     : 46.6 MB
// URL        : https://leetcode.com/problems/remove-duplicates-from-sorted-array/

class Solution {
    public int removeDuplicates(int[] nums) {
        int uniqueIndex = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i]!=nums[uniqueIndex]){
                uniqueIndex++;
                nums[uniqueIndex] = nums[i];
            }
        }
        return uniqueIndex + 1;
    }
}