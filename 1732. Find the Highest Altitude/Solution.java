// 1732. Find the Highest Altitude
// Difficulty : Easy
// Runtime    : 0 ms
// Memory     : 43 MB
// URL        : https://leetcode.com/problems/find-the-highest-altitude/

class Solution {
    public int largestAltitude(int[] gain) {
        int prefix[] = new int[gain.length+1];
        prefix[0] = 0;
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + gain[i-1];
        }

        int max = Integer.MIN_VALUE;
        for(int i=0; i<prefix.length; i++){
            if(prefix[i] > max){
                max = prefix[i];
            }
        }

        return max;
    }
}