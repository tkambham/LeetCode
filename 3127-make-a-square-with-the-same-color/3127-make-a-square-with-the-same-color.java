class Solution {
    public boolean canMakeSquare(char[][] grid) {
        for(int i = 0;i<grid.length-1;i++){
            for(int j = 0;j<grid[0].length-1;j++){
                int countW = 0;
                int countB = 0;

                char[] cells = {
                    grid[i][j],
                    grid[i][j + 1],
                    grid[i + 1][j],
                    grid[i + 1][j + 1]
                };

                for (char c : cells) {
                    if (c == 'W') countW++;
                    else if (c == 'B') countB++;
                }

                if (countW >= 3 || countB >= 3) {
                    return true;
                }
            }
        }
        return false;
    }
}