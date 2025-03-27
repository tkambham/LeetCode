class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i =0;i<k;i++){
            sum = sum+nums[i];
        }
        double maxAverage = sum/(k*1.0);
        for(int i = k;i<nums.length;i++){
            sum = sum + (nums[i]-nums[i-k]);
            double localAverage = sum/(k*1.0);
            maxAverage = Math.max(maxAverage, localAverage);
        }
        return maxAverage;
    }
}