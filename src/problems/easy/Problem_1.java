package problems.easy;

import java.util.HashMap;
import java.util.Map;

/*
*1. Two Sum
* Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].


* */
public class Problem_1 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(target - nums[i])){
                res[0] = map.get(target- nums[i]);
                res[1] = i;
            }
            map.put(nums[i], i );
        }
        return res;
    }
}
