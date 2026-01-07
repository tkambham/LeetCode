class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxEnding = 0, minEnding = 0;
        int maxSum = 0, minSum = 0;

        for (int num : nums) {
            maxEnding = Math.max(num, maxEnding + num);
            minEnding = Math.min(num, minEnding + num);

            maxSum = Math.max(maxSum, maxEnding);
            minSum = Math.min(minSum, minEnding);
        }

        return Math.max(maxSum, Math.abs(minSum));
    }
}