class Solution {
    public int[] runningSum(int[] nums) {
        int[] result = new int[nums.length];
        int sum = 0;
        int k =0;
        for(int i : nums){
            sum += i;
            result[k] = sum;
            k++;
        }

        return result;
    }
}