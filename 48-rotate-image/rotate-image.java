
class Solution {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse(matrix);
    }

    public void transpose(int[][] matrix) {
        int n = matrix.length;
        int i = 0;

        while (i < n) {
            int j = i + 1;

            while (j < n) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;

                j++;
            }

            i++;
        }
    }

    public void reverse(int[][] matrix) {
        int n = matrix.length;
        int i = 0;

        while (i < n) {
            int left = 0;
            int right = n - 1;

            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;

                left++;
                right--;
            }

            i++;
        }
    }
}
