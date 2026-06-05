// 2126. Destroying Asteroids
// Difficulty : Medium
// Runtime    : 27 ms
// Memory     : 107.6 MB
// URL        : https://leetcode.com/problems/destroying-asteroids/


class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        int n = asteroids.length;

        Arrays.sort(asteroids);

        long sum = mass;

        for(int i=0;i<n;i++){
            if(asteroids[i] > sum) return false;

            sum += asteroids[i];
        }

        return true;
    }
}