// 0035. Search Insert Position
// Difficulty : Easy
// Runtime    : 0 ms
// Memory     : 44.7 MB
// URL        : https://leetcode.com/problems/search-insert-position/

class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(target > nums[mid]){
                start = mid +1;
            }else if(target < nums[mid]){
                end = mid -1;
            }else{
                return mid;
            }
        }

        return start;
    }
}