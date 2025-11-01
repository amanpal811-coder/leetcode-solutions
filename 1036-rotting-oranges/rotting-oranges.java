public class Solution {
    public int orangesRotting(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int fresh = 0, minutes = 0;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 2) {
                    queue.offer(new int[]{r, c});
                } else if (grid[r][c] == 1) {
                    fresh++;
                }
            }
        }

        int[][] directions = {{1,0},{-1,0},{0,1},{0,-1}};
        while (!queue.isEmpty() && fresh > 0) {
            int size = queue.size();
            minutes++;

            for (int i = 0; i < size; i++) {
                int[] pos = queue.poll();
                for (int[] d : directions) {
                    int r = pos[0] + d[0], c = pos[1] + d[1];
                    if (r >= 0 && r < rows && c >= 0 && c < cols && grid[r][c] == 1) {
                        grid[r][c] = 2;
                        fresh--;
                        queue.offer(new int[]{r, c});
                    }
                }
            }
        }

        return fresh == 0 ? minutes : -1;
    }
}