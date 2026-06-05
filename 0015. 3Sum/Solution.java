// 0015. 3Sum
// Difficulty : Medium
// Runtime    : 38 ms
// Memory     : 59.4 MB
// URL        : https://leetcode.com/problems/3sum/

import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        int n = nums.length;
        int left, right, target, sum=0;

        for(int i=0; i<n-2; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }

            left = i+1 ;
            right = n-1;
            target = -nums[i];

            while(left<right){
                sum = nums[left]+nums[right];
                if(sum==target){
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                    while(left<n && nums[left]==nums[left-1]){
                        left++;
                    }
                    while(right>=0  && nums[right]==nums[right+1]){
                        right--;
                    }
                }else if(sum<target){
                    left++;
                }else{
                    right--;
                }
            }

        

        }

        return result;
        
    }
}