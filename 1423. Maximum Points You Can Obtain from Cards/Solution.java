// 1423. Maximum Points You Can Obtain from Cards
// Difficulty : Medium
// Runtime    : 2 ms
// Memory     : 61.9 MB
// URL        : https://leetcode.com/problems/maximum-points-you-can-obtain-from-cards/

class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int n = cardPoints.length;
       int totalSum = 0;

       for(int num : cardPoints){
            totalSum += num;
       }

       int windowSize = n-k;
       if (windowSize == 0)
            return totalSum;
    
       int windowSum = 0;

       for(int i=0; i<windowSize; i++){
            windowSum += cardPoints[i];
       }

       int minWindowSum = windowSum;

       for(int i=windowSize; i<n; i++){
        windowSum = windowSum + cardPoints[i] - cardPoints[i - windowSize];
        minWindowSum = Math.min(minWindowSum, windowSum);
       }

       return totalSum - minWindowSum;
    }
}