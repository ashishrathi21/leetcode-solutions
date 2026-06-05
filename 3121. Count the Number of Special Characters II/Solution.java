// 3121. Count the Number of Special Characters II
// Difficulty : Medium
// Runtime    : 21 ms
// Memory     : 48.4 MB
// URL        : https://leetcode.com/problems/count-the-number-of-special-characters-ii/

class Solution {
    public int numberOfSpecialChars(String word) {
       int[] lastLower = new int[26];
        int[] firstUpper = new int[26];
        
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            
            if (Character.isLowerCase(ch)) {
                lastLower[ch - 'a'] = i + 1; 
            } else {
                if (firstUpper[ch - 'A'] == 0) {
                    firstUpper[ch - 'A'] = i + 1;
                }
            }
        }
        
        int specialCount = 0;
        
        for (int i = 0; i < 26; i++) {
            if (lastLower[i] > 0 && firstUpper[i] > 0 && lastLower[i] < firstUpper[i]) {
                specialCount++;
            }
        }
        
        return specialCount;
    }
}