class MyHashSet {
    Set<Integer> newSet;

    public MyHashSet() {
        newSet = new HashSet<Integer>();
    }
    
    public void add(int key) {
        newSet.add(key);
    }
    
    public void remove(int key) {
        newSet.remove(key);
    }
    
    public boolean contains(int key) {
        return newSet.contains(key);
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */