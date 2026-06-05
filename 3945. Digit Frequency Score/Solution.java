// 3945. Digit Frequency Score
// Difficulty : Easy
// Runtime    : 1 ms
// Memory     : 42.9 MB
// URL        : https://leetcode.com/problems/digit-frequency-score/

class Solution {
    public int digitFrequencyScore(int n) {
        int freq[] = new int[10];
        while(n != 0){
            int last = n%10;
            freq[last]++;
            n /= 10;
        }

        int sum =0;

        for(int i=0; i<10; i++){
            sum+=i*freq[i];
        }

        return sum;
    }
}