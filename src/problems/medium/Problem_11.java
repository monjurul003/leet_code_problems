package problems.medium;
/*
11. Container With Most Water
Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). Find two lines, which together with x-axis forms a container, such that the container contains the most water.

        Note: You may not slant the container and n is at least 2.

        The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49

        Example:

        Input: [1,8,6,2,5,4,8,3,7]
        Output: 49

 */
public class Problem_11 {
    public int maxArea(int[] height) {
        int water_level = 0;
        int i = 0;
        int j= height.length-1;
        while(i<j){
            water_level = Math.max(water_level, (j-i) * Math.min(height[j],height[i]));
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return water_level;
    }
}
