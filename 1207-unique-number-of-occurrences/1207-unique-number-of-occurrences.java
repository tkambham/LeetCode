class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : arr){
            if(!map.containsKey(i)){
                map.put(i,1);
            }
            else{
                int val = map.get(i);
                val++;
                map.replace(i, val);
            }
        }
        Set<Integer> values = new HashSet<>();
        for(int i : map.values()){
            values.add(i);
        }
        if(values.size() == map.size()){
            return true;
        }
        return false;
    }
}