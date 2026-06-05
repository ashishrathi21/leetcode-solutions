// 0217. Contains Duplicate
// Difficulty : Easy
// Runtime    : 24 ms
// Memory     : 95.4 MB
// URL        : https://leetcode.com/problems/contains-duplicate/

import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);

            if(map.get(num) > 1){
                return true; // duplicate found
            }
        }

        return false;
    }
    
}