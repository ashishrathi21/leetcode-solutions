// 0977. Squares of a Sorted Array
// Difficulty : Easy
// Runtime    : 1 ms
// Memory     : 47.1 MB
// URL        : https://leetcode.com/problems/squares-of-a-sorted-array/

class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] res = new int [nums.length];
        int left = 0;
        int right = nums.length -1;
        int resPointer = res.length -1;

        while(left<=right){
            if(Math.abs(nums[left])<Math.abs(nums[right])){
                res[resPointer] = nums[right]*nums[right];
                right --;
            }else{
                res[resPointer] = nums[left]*nums[left];
                left ++;
            }
            resPointer --;
        }
        return res;
    }
}