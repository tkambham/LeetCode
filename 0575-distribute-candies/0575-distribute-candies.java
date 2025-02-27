class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> res = new HashSet<>();
        for(int i = 0;i<candyType.length;i++){
            if(res.size() == candyType.length/2){
                break;
            }
            res.add(candyType[i]);
        }
        return res.size();
    }
}