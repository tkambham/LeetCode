class Solution {
    public int rob(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }
        else if(nums.length == 2){
            return Math.max(nums[0],nums[1]);
        }

        int[] arr = new int[nums.length];
        arr[0] = nums[0];
        arr[1] = Math.max(nums[0],nums[1]);

        for(int i = 2; i < arr.length; i++){
            arr[i] = Math.max(arr[i-1], (arr[i-2]+nums[i]));
        }

        return arr[arr.length-1];
    }
}