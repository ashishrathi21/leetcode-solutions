// 3254. Find the Power of K-Size Subarrays I
// Difficulty : Medium
// Runtime    : 2 ms
// Memory     : 47.2 MB
// URL        : https://leetcode.com/problems/find-the-power-of-k-size-subarrays-i/

class Solution {
    public int[] resultsArray(int[] nums, int k) {
     int n = nums.length;
     int result[] = new int[n-k+1];

     for(int i=0; i<=n-k; i++){
        boolean valid = true;
        for(int j=i; j<i+k-1; j++){
            if(nums[j+1] != nums[j]+1){
                valid =false;
                break;
            }
        }

        if(valid){
            result[i] = nums[i+k-1];
        }else{
            result[i] = -1;
        }
     }
        

        return result;
    }
}