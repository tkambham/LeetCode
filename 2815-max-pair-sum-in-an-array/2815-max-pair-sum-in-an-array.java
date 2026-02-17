class Solution {
    public int maxSum(int[] nums) {
        int[] maxByDigit = new int[10];
        
        for (int i = 0; i < 10; i++) {
            maxByDigit[i] = -1;
        }
        
        int result = -1;
        
        for (int num : nums) {
            int maxDigit = getMaxDigit(num);
            
            if (maxByDigit[maxDigit] != -1) {
                result = Math.max(result, maxByDigit[maxDigit] + num);
                maxByDigit[maxDigit] = Math.max(maxByDigit[maxDigit], num);
            } else {
                maxByDigit[maxDigit] = num;
            }
        }
        
        return result;
    }
    
    private int getMaxDigit(int num) {
        int max = 0;
        while (num > 0) {
            max = Math.max(max, num % 10);
            num /= 10;
        }
        return max;
    }
}