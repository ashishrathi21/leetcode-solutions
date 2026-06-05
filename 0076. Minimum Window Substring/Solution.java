// 0076. Minimum Window Substring
// Difficulty : Hard
// Runtime    : 1549 ms
// Memory     : 46.5 MB
// URL        : https://leetcode.com/problems/minimum-window-substring/

class Solution {

    public boolean isValid(int[] sfreq, int[] tfreq, String t) {

        for(int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);

            if(sfreq[ch] < tfreq[ch]) {
                return false;
            }
        }

        return true;
    }

    public String minWindow(String s, String t) {

        int[] sfreq = new int[256];
        int[] tfreq = new int[256];

        for(int i = 0; i < t.length(); i++) {
            tfreq[t.charAt(i)]++;
        }

        int left = 0;

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        for(int right = 0; right < s.length(); right++) {

            sfreq[s.charAt(right)]++;

            while(isValid(sfreq, tfreq, t)) {

                int len = right - left + 1;

                if(len < minLen) {
                    minLen = len;
                    start = left;
                }

                sfreq[s.charAt(left)]--;
                left++;
            }
        }

        if(minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }
}