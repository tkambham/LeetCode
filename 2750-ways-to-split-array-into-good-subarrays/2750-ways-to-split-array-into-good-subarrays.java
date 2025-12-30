class Solution {
    public int numberOfGoodSubarraySplits(int[] nums) {

        final int MOD = 1_000_000_007;
        int onesCount = 0;
        long goodArrays = 1;
        int prevOneIndex = -1;

        for(int i = 0;i<nums.length;i++){
            if (nums[i] == 1) {
                onesCount++;

                if (prevOneIndex != -1) {
                    goodArrays = (goodArrays * (i - prevOneIndex)) % MOD;
                }

                prevOneIndex = i;
            }
        }
        if(onesCount == 0){
            return 0;
        }
        return (int) goodArrays;
    }
}