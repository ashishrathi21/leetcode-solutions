// 0231. Power of Two
// Difficulty : Easy
// Runtime    : 1 ms
// Memory     : 42.4 MB
// URL        : https://leetcode.com/problems/power-of-two/

class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n <= 0)
            return false;

        while(n % 2 == 0){
            n /= 2;
        }

        return n==1;
    }
}