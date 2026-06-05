// 0287. Find the Duplicate Number
// Difficulty : Medium
// Runtime    : 5 ms
// Memory     : 83.1 MB
// URL        : https://leetcode.com/problems/find-the-duplicate-number/

class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 0;

        while(true){
            slow = nums[slow];
            fast = nums[fast];
            fast = nums[fast];

            if(slow == fast){
                slow = 0;

                while(slow!=fast){
                    slow = nums[slow];
                    fast = nums[fast];
                }

                return slow;
            }
        }
    }
}