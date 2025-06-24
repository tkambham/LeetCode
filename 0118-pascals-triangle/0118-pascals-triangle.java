class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        result.add(Arrays.asList(1));
        if(numRows == 1){
            return result;
        }
        result.add(Arrays.asList(1,1));
        if(numRows == 2){
            return result;
        }
        for(int i = 2; i<numRows;i++){
            List<Integer> inside = new ArrayList<Integer>();
            for(int j = 0;j<=i;j++){
                if(j==0 || j==i){
                    inside.add(1);
                }
                else{
                    inside.add(result.get(i-1).get(j-1)+result.get(i-1).get(j));
                }
            }
            result.add(inside);
        }
        return result;
    }
}