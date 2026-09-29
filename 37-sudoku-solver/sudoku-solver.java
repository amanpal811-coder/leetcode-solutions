class Solution {

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    boolean isSafe(char[][] board, int row, int col, char dig) {

        // Check row
        for (int i = 0; i < 9; i++) {
            if (board[row][i] == dig) {
                return false;
            }
        }

        // Check column
        for (int j = 0; j < 9; j++) {
            if (board[j][col] == dig) {
                return false;
            }
        }

        // Check 3 x 3 box
        int srow = (row / 3) * 3;
        int scol = (col / 3) * 3;

        for (int i = srow; i < srow + 3; i++) {
            for (int j = scol; j < scol + 3; j++) {
                if (board[i][j] == dig) {
                    return false;
                }
            }
        }

        return true;
    }

    boolean helper(char[][] board, int row, int col) {

        // All cells completed
        if (row == 9) {
            return true;
        }

        // Find next cell
        int nextRow = row;
        int nextCol = col + 1;

        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // If cell is already filled, move ahead
        if (board[row][col] != '.') {
            return helper(board, nextRow, nextCol);
        }

        // Try digits 1 to 9
        for (char dig = '1'; dig <= '9'; dig++) {

            if (isSafe(board, row, col, dig)) {

                // Place digit
                board[row][col] = dig;

                // Solve next cell
                if (helper(board, nextRow, nextCol)) {
                    return true;
                }

                // Backtrack
                board[row][col] = '.';
            }
        }

        return false;
    }
}