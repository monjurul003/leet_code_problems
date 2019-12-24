package problems.medium;
/*
* 357. Count Numbers with Unique Digits
* Given a non-negative integer n, count all numbers with unique digits, x, where 0 ≤ x < 10n.

Example:

Input: 2
Output: 91
Explanation: The answer should be the total numbers in the range of 0 ≤ x < 100,
             excluding 11,22,33,44,55,66,77,88,99
* */
public class Problem_357 {
    public int[] result =  new int[100];
    public int getCount(int digit){
        if(digit == 1){
            return 10; // 0,1,2,3,4,5,6,7,8,9
        }
        /*for two digit 9 digit can be placed on the 10th position except 0.
         1th place 9 digit can be placed except rthe digit placed on the 10th position*/
        int count = 9;
        int result =9;
        while(--digit > 0){
            result *= digit;
            count--;
        }
        return result;
    }
    public int countNumbersWithUniqueDigits(int n) {
        if(n==0 || n>= 100){
            return 0;
        }else{
            if(result[n] == 0) {
                result[n] = getCount(n) + countNumbersWithUniqueDigits(n-1);
            }else {
                return result[n];
            }
        }
        return result[n];

    }
}
