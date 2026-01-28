class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int bCount = 0;
        int bSum = 0;

        for(int i : nums){
            bSum += i;
            if(bSum == 0){
                bCount++;
            }
        }

        return bCount;
    }
}