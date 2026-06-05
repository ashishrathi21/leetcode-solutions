// 1768. Merge Strings Alternately
// Difficulty : Easy
// Runtime    : 1 ms
// Memory     : 42.8 MB
// URL        : https://leetcode.com/problems/merge-strings-alternately/

class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int n = word1.length();
        int m = word2.length();
        int left = 0;
        int right = 0;
        boolean alt = true;

        while(left < n && right < m){
            

            if(alt){
                sb.append(word1.charAt(left));
                left++;
                alt = false;
            }else{
                sb.append(word2.charAt(right));
                right++;
                alt = true;
            }
        }

        while(left < n){
            sb.append(word1.charAt(left));
            left++;
        }
        while(right < m){
             sb.append(word2.charAt(right));
            right++;
        }

        String text = sb.toString();
        return text;
        
    }
}