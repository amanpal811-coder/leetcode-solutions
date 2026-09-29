class Solution {
    public boolean isValidSudoku(char[][] board) {
        return helper(board, 0, 0);
    }

    boolean isSafe(char[][] board, int row, int col, char dig) {

        for (int i = 0; i < 9; i++) {
            if (i != col && board[row][i] == dig) {
                return false;
            }
        }

        for (int i = 0; i < 9; i++) {
            if (i != row && board[i][col] == dig) {
                return false;
            }
        }

        int srow = (row / 3) * 3;
        int scol = (col / 3) * 3;

        for (int i = srow; i < srow + 3; i++) {
            for (int j = scol; j < scol + 3; j++) {

                if ((i != row || j != col) && board[i][j] == dig) {
                    return false;
                }
            }
        }

        return true;
    }

    boolean helper(char[][] board, int row, int col) {

        if (row == 9) {
            return true;
        }

        int nextRow = row;
        int nextCol = col + 1;

        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        if (board[row][col] == '.') {
            return helper(board, nextRow, nextCol);
        }

        if (!isSafe(board, row, col, board[row][col])) {
            return false;
        }

        return helper(board, nextRow, nextCol);
    }
}