class Solution {
    public int makeConnected(int n, int[][] connections) {
        if(connections.length < n-1){
            return -1;
        }

        List<List<Integer>> graph = new ArrayList<>();

        for(int i =0;i<n;i++){
            graph.add(new ArrayList<>());
        }

        for(int[] con : connections){
            graph.get(con[0]).add(con[1]);
            graph.get(con[1]).add(con[0]);
        }

        boolean[] visited = new boolean[n];
        int components = 0;

        for(int i= 0;i<n;i++){
            if(!visited[i]){
                components++;
                Queue<Integer> queue = new LinkedList<>();
                queue.add(i);
                visited[i] = true;

                while (!queue.isEmpty()) {
                    int curr = queue.poll();
                    for (int neighbor : graph.get(curr)) {
                        if (!visited[neighbor]) {
                            visited[neighbor] = true;
                            queue.add(neighbor);
                        }
                    }
                }
            }
        }

        return components -1;
    }
}