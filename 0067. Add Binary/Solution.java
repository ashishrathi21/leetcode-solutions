// 0067. Add Binary
// Difficulty : Easy
// Runtime    : 6 ms
// Memory     : 43.9 MB
// URL        : https://leetcode.com/problems/add-binary/

import java.math.BigInteger;
class Solution {
    public String addBinary(String a, String b) {
        BigInteger s1 = new BigInteger(a, 2); 
        BigInteger s2 = new BigInteger(b, 2); 
        
        BigInteger sum = s1.add(s2);

        String str = sum.toString(2);
        return str;
    }
}