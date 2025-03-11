class Solution {
    public int[] leftRightDifference(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;
        int[] list = new int[nums.length];
        for(int i : nums){
            totalSum += i;
        }
        System.out.println(totalSum);
        for(int i = 0; i<nums.length; i++){
            if(i == 0){
                list[i] = Math.abs(totalSum - nums[i]);
                leftSum += nums[i];
                continue;
            }
            if(i == nums.length-1){
                list[i] = Math.abs(totalSum - nums[i]);
                leftSum += nums[i];
                continue;
            }
            list[i] = Math.abs((totalSum - (leftSum + nums[i])) - leftSum);
            leftSum += nums[i];
        }
        return list;
    }
}