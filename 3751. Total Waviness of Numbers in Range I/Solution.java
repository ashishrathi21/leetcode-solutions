// 3751. Total Waviness of Numbers in Range I
// Difficulty : Medium
// Runtime    : 15 ms
// Memory     : 42.7 MB
// URL        : https://leetcode.com/problems/total-waviness-of-numbers-in-range-i/

class Solution {
    public int totalWaviness(int num1, int num2) {
        int peaks = 0;
        int valleys = 0;
        
        for(int i = num1; i <= num2; i++) {
            int temp = i;

            while(temp >= 100) {
                int right = temp % 10;
                int mid   = (temp / 10) % 10;
                int left  = (temp / 100) % 10;

                if(mid > left && mid > right) peaks++;
                if(mid < left && mid < right) valleys++;

                temp /= 10;
            }
        }

        return peaks + valleys;
    }
}