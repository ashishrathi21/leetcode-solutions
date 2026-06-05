// 0125. Valid Palindrome
// Difficulty : Easy
// Runtime    : 14 ms
// Memory     : 46.5 MB
// URL        : https://leetcode.com/problems/valid-palindrome/

class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        char[] arr = s.toCharArray();

        int l =0;
        int r = arr.length - 1;

        while (l <= r) {

            if (arr[l] == arr[r]) {
                l++;
                r--;
            }
            else {
                return false;
            }
        }

        return true;

    }
}