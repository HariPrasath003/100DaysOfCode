// Given an integer x, return true if x is a 
// palindrome
// , and false otherwise.

 

// Example 1:

// Input: x = 121
// Output: true
// Explanation: 121 reads as 121 from left to right and from right to left.
// Example 2:

// Input: x = -121
// Output: false
// Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
// Example 3:

// Input: x = 10
// Output: false
// Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


class Solution {
    public boolean isPalindrome(int x) {
        
        if(x == 0 ){
            return true;
        }
        if(x < 0 || x % 10 == 0){
            return false;
        }
        int reversed_int = 0;
        while(x > reversed_int){
            int pop = x % 10;
            x /= 10;

            reversed_int = (reversed_int * 10) + pop;
        }
        if(x == reversed_int || x == reversed_int / 10 ){
            return true;
        }else{
            return false;
        }
    }
}