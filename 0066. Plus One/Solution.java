// 0066. Plus One
// Difficulty : Easy
// Runtime    : 0 ms
// Memory     : 43.3 MB
// URL        : https://leetcode.com/problems/plus-one/

class Solution {
    public int[] plusOne(int[] digits) {
        // Piche se loop chalayein
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++; // Agar 9 se chota hai toh bas +1 karein
                return digits; // Kaam khatam, array return kar dein
            }
            digits[i] = 0; // Agar 9 hai, toh usse 0 banayein aur carry aage le jayein
        }

        // Agar saare digits 9 the (e.g., 999), toh naya array banega (1000)
        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
