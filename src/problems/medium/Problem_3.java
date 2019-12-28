package problems.medium;
import java.util.HashSet;
import java.util.Set;

/*
3. Longest Substring Without Repeating Characters
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.


* */
public class Problem_3 {

    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if(n == 0){
            return 0;
        }
        int[] dp = new int[n+1];
        dp[0] = 0;
        for(int i=0; i<n; i++){
            Set<Character> set = new HashSet<>();
            int count = 0;
            int j = i;
            while(j<n){
                if(!set.add(s.charAt(j))){
                    if(count == n ){
                        return count;
                    }
                    break;
                }
                count++;
                j++;
            }
            dp[i+1] = Math.max(dp[i],count);
        }

        return dp[n];
    }
}
