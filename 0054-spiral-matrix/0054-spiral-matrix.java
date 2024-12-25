class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
       List<Integer> result = new ArrayList<>();
        
        int sr = 0, sc = 0;
        int er = matrix.length - 1;
        int ec = matrix[0].length - 1;
        
        while (sr <= er && sc <= ec) {
            // Traverse top row
            for (int j = sc; j <= ec; j++) {
                result.add(matrix[sr][j]);
            }
            sr++;  // Move the starting row down
            
            // Traverse right column
            for (int i = sr; i <= er; i++) {
                result.add(matrix[i][ec]);
            }
            ec--;  // Move the ending column left
            
            if (sr <= er) {
                // Traverse bottom row (if there's still a row left)
                for (int j = ec; j >= sc; j--) {
                    result.add(matrix[er][j]);
                }
                er--;  // Move the ending row up
            }
            
            if (sc <= ec) {
                // Traverse left column (if there's still a column left)
                for (int i = er; i >= sr; i--) {
                    result.add(matrix[i][sc]);
                }
                sc++;  // Move the starting column right
            }
        }
        
        return result;
    }

    
}