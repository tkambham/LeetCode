class BrowserHistory {
    List<String> visited;
    int current;
    public BrowserHistory(String homepage) {
        visited = new ArrayList<>();
        visited.add(homepage);
        current = 0;
    }
    
    public void visit(String url) {
        while (visited.size() > current + 1) {
            visited.remove(visited.size() - 1);
        }
        visited.add(url);
        current++;
    }
    
    public String back(int steps) {
        current = Math.max(0, current - steps);
        return visited.get(current);
    }
    
    public String forward(int steps) {
        current = Math.min(visited.size() - 1, current + steps);
        return visited.get(current);
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */