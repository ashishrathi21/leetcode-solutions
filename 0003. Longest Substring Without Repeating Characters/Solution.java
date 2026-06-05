// 0003. Longest Substring Without Repeating Characters
// Difficulty : Medium
// Runtime    : 6 ms
// Memory     : 46.5 MB
// URL        : https://leetcode.com/problems/longest-substring-without-repeating-characters/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int low = 0;
        int high = 0;
        int maxLen = 0;

        while(high < s.length()){
        
            while(set.contains(s.charAt(high))){
                set.remove(s.charAt(low));
                low++;
            }

            set.add(s.charAt(high));
           

            int len = high-low+1;
            maxLen = Math.max(maxLen, len);

            high++;
        }
        return maxLen;
    }
}