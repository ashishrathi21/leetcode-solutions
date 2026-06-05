// 0349. Intersection of Two Arrays
// Difficulty : Easy
// Runtime    : 3 ms
// Memory     : 45 MB
// URL        : https://leetcode.com/problems/intersection-of-two-arrays/

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> num1 = new HashSet<>();
        HashSet<Integer> num2 = new HashSet<>();

        for(int i = 0; i < nums1.length; i++){
            num1.add(nums1[i]);
        }

        for(int i = 0; i < nums2.length; i++){
            num2.add(nums2[i]);
        }  

        num1.retainAll(num2);

        int[] ans = new int[num1.size()];
        int idx = 0;

        for(int x : num1){
            ans[idx++] = x;
        }

        return ans;


    }
}