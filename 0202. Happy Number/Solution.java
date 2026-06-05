// 0202. Happy Number
// Difficulty : Easy
// Runtime    : 1 ms
// Memory     : 42.5 MB
// URL        : https://leetcode.com/problems/happy-number/

class Solution {
    public int sumOfSquares(int n){
        int sum = 0;

        while(n>0){
            int digit = n%10;
            sum += digit*digit;
            n /= 10;
        }

        return sum; 
    }
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        while(fast !=1 ){
            slow = sumOfSquares(slow);
            fast =  sumOfSquares(sumOfSquares(fast));

            if(fast == 1){
                return true;
            }

             if(fast == slow){
                return false;
            }
        }
        return true;
    }
}