class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i = 0;i<items2.length;i++){
            map.put(items2[i][0], map.getOrDefault(items2[i][0],0) + items2[i][1]);
        }
        for(int i =0;i<items1.length;i++){
            map.put(items1[i][0], map.getOrDefault(items1[i][0],0) + items1[i][1]);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            result.add(Arrays.asList(entry.getKey(), entry.getValue()));
        }

        return result;
    }
}