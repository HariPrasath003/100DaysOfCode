// Problem statement
// Given an array ‘A’ consisting of ‘N’ integers and an integer ‘B’, find the number of subarrays of array ‘A’ whose bitwise XOR( ⊕ ) of all elements is equal to ‘B’.



// A subarray of an array is obtained by removing some(zero or more) elements from the front and back of the array.



// Example:
// Input: ‘N’ = 4 ‘B’ = 2
// ‘A’ = [1, 2, 3, 2]

// Output: 3

// Explanation: Subarrays have bitwise xor equal to ‘2’ are: [1, 2, 3, 2], [2], [2].
// Detailed explanation ( Input/output format, Notes, Images )
// Sample Input 1:
// 4 2
// 1 2 3 2
// Sample Output 1 :
// 3
// Explanation Of Sample Input 1:
// Input: ‘N’ = 4 ‘B’ = 2
// ‘A’ = [1, 2, 3, 2]

// Output: 3

// Explanation: Subarrays have bitwise xor equal to ‘2’ are: [1, 2, 3, 2], [2], [2].
// Sample Input 2:
// 4 3
// 1 2 3 3
// Sample Output 2:
// 4
// Sample Input 3:
// 5 6
// 1 3 3 3 5 
// Sample Output 3:
// 2
// Constraints:
// 1 <= N <= 10^3
// 1 <= A[i], B <= 10^9

// Time Limit: 1-sec

public class Solution {
    public static int subarraysWithSumK(int []a, int b) {
        
        int count = 0; 
        int n = a.length; 

        for(int i = 0; i < n; ++i) {
            int curr = 0;
            for(int j = i; j < n; ++j) {
                curr ^= a[j];

                if(curr == b) {
                    ++count;
                }
            }
        }
        return count;
    }
}