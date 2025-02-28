class Solution {
    public boolean satisfiesConditions(int[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return false;
        }
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length - 1; j++) {
                if (grid[i][j] == grid[i][j + 1]) {
                    return false;
                }
            }
            if (i < grid.length - 1) {
                for (int j = 0; j < grid[i].length; j++) {
                    if (grid[i][j] != grid[i + 1][j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}