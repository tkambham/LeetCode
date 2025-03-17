class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> save = new HashMap<>();
        save.put(0,-1);

        int s = 0;
        for(int i =0;i<nums.length;i++){
            s+=nums[i];

            if(k!=0){
                s = s%k;
            }

            if(save.containsKey(s)){
                if(i-save.get(s)>=2){
                    return true;
                }
            }
            else{
                save.put(s, i);
            }
        }
        return false;
    }
}