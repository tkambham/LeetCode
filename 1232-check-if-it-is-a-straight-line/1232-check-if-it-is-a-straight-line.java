class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int dx = coordinates[1][0] - coordinates[0][0];
        int dy = coordinates[1][1] - coordinates[0][1];

        for (int i = 2; i < coordinates.length; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];

            if (dy * (x - coordinates[0][0]) != dx * (y - coordinates[0][1])) {
                return false;
            }
        }
        return true;
    }
}