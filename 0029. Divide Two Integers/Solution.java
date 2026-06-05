// 0029. Divide Two Integers
// Difficulty : Medium
// Runtime    : 1 ms
// Memory     : 42.7 MB
// URL        : https://leetcode.com/problems/divide-two-integers/

class Solution {
    public int divide(int dividend, int divisor) {
        
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        return dividend / divisor;
    }
}