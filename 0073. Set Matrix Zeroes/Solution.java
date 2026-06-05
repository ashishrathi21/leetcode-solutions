// 0073. Set Matrix Zeroes
// Difficulty : Medium
// Runtime    : 1 ms
// Memory     : 47.9 MB
// URL        : https://leetcode.com/problems/set-matrix-zeroes/

class Solution {
    public void setZeroes(int[][] matrix) {
         int m = matrix.length;
    int n = matrix[0].length;

    boolean[] rows = new boolean[m];
    boolean[] cols = new boolean[n];

    // mark rows and cols
    for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            if(matrix[i][j] == 0){
                rows[i] = true;
                cols[j] = true;
            }
        }
    }

    // update matrix
    for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            if(rows[i] || cols[j]){
                matrix[i][j] = 0;
            }
        }
    }
    }
}