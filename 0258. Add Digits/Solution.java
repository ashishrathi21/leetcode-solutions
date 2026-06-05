// 0258. Add Digits
// Difficulty : Easy
// Runtime    : 1 ms
// Memory     : 43 MB
// URL        : https://leetcode.com/problems/add-digits/

class Solution {
    public int addDigits(int num) {
        while (num >=10){
            int sum = 0;
            while (num > 0){
                sum += num %10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }
}