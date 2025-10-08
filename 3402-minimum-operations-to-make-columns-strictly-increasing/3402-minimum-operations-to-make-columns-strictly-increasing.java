class Solution {
    public int minimumOperations(int[][] grid) {
        int op = 0;
        for(int i = 1;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                if(grid[i][j]>grid[i-1][j]){
                    continue;
                }
                else{
                    int increase = grid[i-1][j] - grid[i][j] + 1;
                    grid[i][j] += increase;
                    op += increase;
                }
            }
        }
        return op;
    }
}