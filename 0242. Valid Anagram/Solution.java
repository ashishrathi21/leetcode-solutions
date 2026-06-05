// 0242. Valid Anagram
// Difficulty : Easy
// Runtime    : 5 ms
// Memory     : 44.4 MB
// URL        : https://leetcode.com/problems/valid-anagram/

import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
        String s1 = s.toLowerCase();
        String s2 = t.toLowerCase();

        char hash1[] = new char[26];
        char hash2[] = new char[26];

            for(int i=0; i<s1.length(); i++){
                 hash1[s1.charAt(i) - 'a']++;
            }
            for(int i=0; i<s2.length(); i++){
                hash2[s2.charAt(i) - 'a']++;
            }
        
            if(Arrays.equals(hash1, hash2))
                return true;
            else
                return false;
            
    }
}
