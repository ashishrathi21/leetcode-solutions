// 0167. Two Sum II - Input Array Is Sorted
// Difficulty : Medium
// Runtime    : 2 ms
// Memory     : 48.6 MB
// URL        : https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/

class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left =0;
        int right =numbers.length-1;
        int sum=0;

        while(left<right){
            sum = numbers[left] + numbers[right];

            if(sum == target){
                return new int[]{left+1, right+1};
            }else if(sum<target){
                left++;
            }else{
                right --;
            }
        }

        return new int[]{-1,-1};
    }
}