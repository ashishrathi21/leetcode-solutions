// 0011. Container With Most Water
// Difficulty : Medium
// Runtime    : 3 ms
// Memory     : 77.4 MB
// URL        : https://leetcode.com/problems/container-with-most-water/

class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int size = height.length-1;
        int max_area = 0;

        while(i<j){
            int area =0;
            if(height[i]<height[j]){
                area = size * height[i];
                i++;
            }else{
                area = size * height[j];
                j--;
            }
            size--;

            if(max_area < area){
                max_area = area;
            }
        }

        return max_area;
    }
}