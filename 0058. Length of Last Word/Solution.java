// 0058. Length of Last Word
// Difficulty : Easy
// Runtime    : 0 ms
// Memory     : 43 MB
// URL        : https://leetcode.com/problems/length-of-last-word/

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;
        int i = s.length()-1;
        while(i >=0 && s.charAt(i) == ' '){
            i--;
        }
        while(i >=0 && s.charAt(i) != ' '){
            count ++;
            i--;
        }


        return count;
    }
}