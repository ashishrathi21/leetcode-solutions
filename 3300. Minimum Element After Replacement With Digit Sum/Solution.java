// 3300. Minimum Element After Replacement With Digit Sum
// Difficulty : Easy
// Runtime    : 1 ms
// Memory     : 44.6 MB
// URL        : https://leetcode.com/problems/minimum-element-after-replacement-with-digit-sum/

class Solution {
    public int minElement(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int sum =0;

            while(nums[i] > 0){
                int lastDig = nums[i]%10;
                sum += lastDig;
                nums[i] /= 10;
            }

            nums[i] =sum;
        }

        int min = Integer.MAX_VALUE;

        for(int i=0; i<nums.length; i++){
            if(min > nums[i]){
                min = nums[i];
            }
        }

        return min;
    }
}