// 0412. Fizz Buzz
// Difficulty : Easy
// Runtime    : 2 ms
// Memory     : 47 MB
// URL        : https://leetcode.com/problems/fizz-buzz/

import java.util.*;

class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        
        for (int i = 1; i <= n; i++) {
            // Check for divisibility by 3 and 5 first
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(Integer.toString(i));
            }
        }
        return list;
    }
}
