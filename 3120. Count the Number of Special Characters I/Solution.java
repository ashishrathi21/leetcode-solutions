// 3120. Count the Number of Special Characters I
// Difficulty : Easy
// Runtime    : 1 ms
// Memory     : 43.5 MB
// URL        : https://leetcode.com/problems/count-the-number-of-special-characters-i/

class Solution {
    public int numberOfSpecialChars(String word) {
        boolean small [] = new boolean [26];
        boolean capital [] = new boolean [26];

        for(char ch : word.toCharArray()){
            if(Character.isLowerCase(ch)){
                small[ch - 'a'] = true;
            }else{
                capital[ch - 'A'] = true;
            }
        }

        int count = 0;

        for(int i=0; i<26; i++){
            if(small[i] && capital[i]){
                count++;
            }
        }

        return count;
    }
}