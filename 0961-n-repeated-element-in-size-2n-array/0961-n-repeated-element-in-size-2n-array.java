class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length/2;

        Map<Integer, Integer> newList = new HashMap<>();

        for(int i = 0; i<nums.length;i++){
            newList.put(nums[i], newList.getOrDefault(nums[i], 0)+1);
        }

        for(int i : newList.keySet()){
            if(newList.get(i) == n){
                return i;
            }
        }
        return 0;
    }
}