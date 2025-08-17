class Solution {
    public int minimumEffort(int[][] tasks) {
        Arrays.sort(tasks, (a, b) -> (a[1] - a[0]) - (b[1] - b[0]));

        int energy = 0;
        for(int[] task : tasks){
            int actual = task[0];
            int min = task[1];
            energy = Math.max(actual + energy, min);
        }

        return energy;
    }
}