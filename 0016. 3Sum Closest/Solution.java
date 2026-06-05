// 0016. 3Sum Closest
// Difficulty : Medium
// Runtime    : 16 ms
// Memory     : 45.3 MB
// URL        : https://leetcode.com/problems/3sum-closest/

import java.util.*;
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);

        int n = nums.length;

        int left, right, sum=0;

        int closest = nums[0]+nums[1]+nums[2];

        for(int i=0; i<n-2; i++){
            left = i+1 ;
            right = n-1;

            while(left<right){
                sum = nums[i] + nums[left] + nums[right];

                if(Math.abs(target-sum)<Math.abs(target-closest)){
                    closest = sum;
                }
                if(sum < target) {
                    left++;
                }
                else if(sum > target) {
                    right--;
                }
                else {
                    return sum;
                }
            }
        }
           return closest;
    }
}