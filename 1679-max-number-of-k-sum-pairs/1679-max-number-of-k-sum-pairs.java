class Solution {
    public int maxOperations(int[] nums, int k) {
        Map<Integer, Integer> result = new HashMap<>();
        int count = 0;

        for(int i = 0;i<nums.length;i++){
            int val = k-nums[i];
            if(result.getOrDefault(val, 0)>0){
                count++;
                result.put(val, result.get(val)-1);
            }
            else{
                result.put(nums[i], result.getOrDefault(nums[i], 0) + 1);
            }
        }
        return count;
    }
}