class MapSum {
    private HashMap<String, Integer> mapSum;
    public MapSum() {
        mapSum = new HashMap<>();
    }
    
    public void insert(String key, int val) {
        mapSum.put(key, val);
    }
    
    public int sum(String prefix) {
        int total = 0;
        for (String k : mapSum.keySet()) {
            if (k.startsWith(prefix)) {
                total += mapSum.get(k);
            }
        }
        return total;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */