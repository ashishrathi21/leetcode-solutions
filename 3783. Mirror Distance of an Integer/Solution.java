// 3783. Mirror Distance of an Integer
// Difficulty : Easy
// Runtime    : 1 ms
// Memory     : 42.7 MB
// URL        : https://leetcode.com/problems/mirror-distance-of-an-integer/

class Solution {
    public int mirrorDistance(int n) {
        int m = n;
        int rev = 0;
        while(n>0){
            int dig = n%10;
            rev = rev *10 + dig;
            n/=10;
        }

        int res = Math.abs(rev - m);
        return res;

    }
}