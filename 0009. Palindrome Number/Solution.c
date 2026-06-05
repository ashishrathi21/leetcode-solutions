// 0009. Palindrome Number
// Difficulty : Easy
// Runtime    : 7 ms
// Memory     : 8.2 MB
// URL        : https://leetcode.com/problems/palindrome-number/

bool isPalindrome(int x) {
   
        long r, temp, sum=0;
        temp=x;
        while(x>0)
        {
            r=x%10;
            sum=(sum*10)+r;
            x=x/10;
        }
        if(temp==sum){
            return true;
        }
        else{
            return false;
        }

}
