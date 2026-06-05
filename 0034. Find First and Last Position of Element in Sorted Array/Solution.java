// 0034. Find First and Last Position of Element in Sorted Array
// Difficulty : Medium
// Runtime    : 0 ms
// Memory     : 48 MB
// URL        : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

class Solution {
    public static int firstOcc(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                ans = mid;
                end = mid - 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }

        return ans;
    }

    public static int lastOcc(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

        int ans = -1;

        while(start <= end){
            int mid = start + (end - start)/2;

            if(nums[mid] == target){
                ans = mid;
                start = mid + 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }

        return ans;
    }


    public int[] searchRange(int[] nums, int target) {
        
        int first = firstOcc(nums, target);
        int last = lastOcc(nums, target);

        return new int[]{first, last};
    }
}