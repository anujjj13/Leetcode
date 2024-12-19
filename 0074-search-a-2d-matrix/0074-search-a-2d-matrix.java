class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;        // Number of rows in the matrix
        int n = matrix[0].length;     // Number of columns in the matrix
        int i = 0;                    // Start from the first row
        int j = n - 1;                // Start from the last column
        while (i < m && j >= 0) {     // Continue while within matrix bounds
            if (matrix[i][j] == target) return true;  // If target found, return true
            if (matrix[i][j] > target) {
                j--;  // If current element is greater than target, move left
            } else {
                i++;  // If current element is less than target, move down
            }
        }
        return false;  // Target not found, return false
    }
}
