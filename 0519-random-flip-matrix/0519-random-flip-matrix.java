class Solution {
    int m, n;
    int remaining;
    Random rand;
    Map<Integer, Integer> map;

    public Solution(int m, int n) {
        this.m = m;
        this.n = n;
        this.remaining = m * n;
        this.rand = new Random();
        this.map = new HashMap<>();
    }
    
    public int[] flip() {
        int r = rand.nextInt(remaining);
        remaining--;

        int index = map.getOrDefault(r, r);
        map.put(r, map.getOrDefault(remaining, remaining));

        return new int[] { index / n, index % n };
    }
    
    public void reset() {
        remaining = m * n;
        map.clear();
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(m, n);
 * int[] param_1 = obj.flip();
 * obj.reset();
 */