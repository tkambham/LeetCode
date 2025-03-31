class Solution {
    public int pivotIndex(int[] nums) {
        int rSum = 0;
        for(int i : nums){
            rSum += i;
        }
        int lSum = 0;
        for(int i = 0;i<nums.length;i++){
            rSum = rSum-nums[i];
            if(lSum == rSum){
                return i;
            }
            lSum += nums[i];
        }
        return -1;
    }
}