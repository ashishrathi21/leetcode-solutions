// 0326. Power of Three
// Difficulty : Easy
// Runtime    : 8 ms
// Memory     : 45.9 MB
// URL        : https://leetcode.com/problems/power-of-three/

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n <= 0)
            return false;

        while(n % 3 == 0)
            n /= 3;
        
        return n==1;
    }
}