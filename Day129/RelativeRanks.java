// You are given an integer array score of size n, where score[i] is the score of the ith athlete in a competition. All the scores are guaranteed to be unique.

// The athletes are placed based on their scores, where the 1st place athlete has the highest score, the 2nd place athlete has the 2nd highest score, and so on. The placement of each athlete determines their rank:

// The 1st place athlete's rank is "Gold Medal".
// The 2nd place athlete's rank is "Silver Medal".
// The 3rd place athlete's rank is "Bronze Medal".
// For the 4th place to the nth place athlete, their rank is their placement number (i.e., the xth place athlete's rank is "x").
// Return an array answer of size n where answer[i] is the rank of the ith athlete.

 

// Example 1:

// Input: score = [5,4,3,2,1]
// Output: ["Gold Medal","Silver Medal","Bronze Medal","4","5"]
// Explanation: The placements are [1st, 2nd, 3rd, 4th, 5th].
// Example 2:

// Input: score = [10,3,8,9,4]
// Output: ["Gold Medal","5","Bronze Medal","Silver Medal","4"]
// Explanation: The placements are [1st, 5th, 3rd, 2nd, 4th].

 

// Constraints:

// n == score.length
// 1 <= n <= 104
// 0 <= score[i] <= 106
// All the values in score are unique.

class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        
        int[] temp = Arrays.copyOf(score, score.length);
        Arrays.sort(temp);

        String[] result = new String[score.length];

        int count = 1;
        for(int i=temp.length-1;i>=0;i--){
            int index = helper(score,temp[i]);
            if(count<=3){

                if(count==1){
                    result[index] = "Gold Medal";
                }
                else if(count==2){
                    result[index] = "Silver Medal";
                }
                else{
                    result[index] = "Bronze Medal";
                }
            }
            else{
                result[index] = Integer.toString(count);
            }
            count++;
        }
        return result;
    }

    public static int helper(int[] score,int element){
        for(int i=0;i<score.length;i++){
            if(score[i]==element){
                return i;
            }
        }
        return -1;
    }
}

// Time complexity: O(n^2)
// Space complexity: O(n^2)