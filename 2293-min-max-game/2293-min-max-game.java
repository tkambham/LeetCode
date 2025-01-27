class Solution {
    public int minMaxGame(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        int[] arr = new int[nums.length/2];
        System.out.println(arr.length);
        int j = 0;
        for(int i=0;i<nums.length;i = i+4){
            if(arr.length == 1){
                arr[j] = Math.min(nums[i],nums[i+1]);
                j++;
            }
            else{
                arr[j] = Math.min(nums[i],nums[i+1]);
                j++;
                arr[j] = Math.max(nums[i+2],nums[i+3]);
                j++;
            }
        }
        return minMaxGame(arr);
    }
}