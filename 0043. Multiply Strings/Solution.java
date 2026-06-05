// 0043. Multiply Strings
// Difficulty : Medium
// Runtime    : 8 ms
// Memory     : 44.7 MB
// URL        : https://leetcode.com/problems/multiply-strings/

import java.math.BigInteger;


class Solution {
    public String multiply(String num1, String num2) {
        BigInteger a = new BigInteger(num1);
        BigInteger b = new BigInteger(num2);

        return a.multiply(b).toString();
    }
}