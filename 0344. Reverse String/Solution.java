// 0344. Reverse String
// Difficulty : Easy
// Runtime    : 1 ms
// Memory     : 48.2 MB
// URL        : https://leetcode.com/problems/reverse-string/

class Solution {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        
        while(left<right){
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++; 
            right--;

        }

       
        
    }
}