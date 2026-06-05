// 0074. Search a 2D Matrix
// Difficulty : Medium
// Runtime    : 0 ms
// Memory     : 43.9 MB
// URL        : https://leetcode.com/problems/search-a-2d-matrix/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]==target){
                    return true;
                }
            }
        }
        return false;
    }
}