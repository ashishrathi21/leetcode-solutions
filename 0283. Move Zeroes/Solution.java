// 0283. Move Zeroes
// Difficulty : Easy
// Runtime    : 3 ms
// Memory     : 47.8 MB
// URL        : https://leetcode.com/problems/move-zeroes/

class Solution {
    public void moveZeroes(int[] nums) {
        
        int x = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                nums[x] = nums[i];
                x++;
            }
        }
        for (int i = x; i < nums.length; i++) {
          nums[i] = 0;
        }

        System.out.println(nums);
    }
}