// 0018. 4Sum
// Difficulty : Medium
// Runtime    : 19 ms
// Memory     : 45.5 MB
// URL        : https://leetcode.com/problems/4sum/

import java.util.*;
 
class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        int n = nums.length;
        int left,right;
        long sum=0;

        for(int i=0;i<n-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1; j<n-2; j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                left = j+1;
                right=n-1;
                

                while(left<right){
                    sum=(long)nums[i]+nums[j]+nums[left]+nums[right];
                    if(sum==target){
                        res.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
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
        }
        return res;
    }
}