// 0744. Find Smallest Letter Greater Than Target
// Difficulty : Easy
// Runtime    : 0 ms
// Memory     : 46.2 MB
// URL        : https://leetcode.com/problems/find-smallest-letter-greater-than-target/

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int left = 0;
        int right = letters.length;
        int mid = 0;

        while(left < right){
            mid = left + (right - left)/2;

            if(target < letters[mid]){
                right = mid;
            }else{
                left = mid + 1;
            }

        } 

        return letters[left % letters.length];
    }
}