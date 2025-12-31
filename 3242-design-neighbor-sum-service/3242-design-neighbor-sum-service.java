class NeighborSum {
    private int[][] grid;

    public NeighborSum(int[][] grid) {
        this.grid = grid;
    }

    private int[] find(int value) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == value) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }
    
    public int adjacentSum(int value) {
        int[] pos = find(value);
        int a = pos[0], b = pos[1];
        int sum = 0;

        if (a == -1) return 0;
    

        if (a - 1 >= 0) sum += grid[a-1][b]; 
        if (a + 1 < grid.length) sum += grid[a+1][b]; 
        if (b - 1 >= 0) sum += grid[a][b-1]; 
        if (b + 1 < grid[0].length) sum += grid[a][b+1];

        return sum;
    }
    
    public int diagonalSum(int value) {
        int[] pos = find(value);
        int a = pos[0], b = pos[1];
        int sum = 0;

        if (a == -1) return 0;

        if (a - 1 >= 0 && b - 1 >= 0) sum += grid[a - 1][b - 1];
        if (a - 1 >= 0 && b + 1 < grid[0].length) sum += grid[a - 1][b + 1];
        if (a + 1 < grid.length && b - 1 >= 0) sum += grid[a + 1][b - 1];
        if (a + 1 < grid.length && b + 1 < grid[0].length) sum += grid[a + 1][b + 1];

        return sum;
    }
}

/**
 * Your NeighborSum object will be instantiated and called as such:
 * NeighborSum obj = new NeighborSum(grid);
 * int param_1 = obj.adjacentSum(value);
 * int param_2 = obj.diagonalSum(value);
 */