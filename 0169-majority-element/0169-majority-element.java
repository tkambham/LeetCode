class Solution {
    public int majorityElement(int[] nums) {
        int num = 0;
        int counter = 0;

        for(int i =0;i<nums.length;i++){
            if(counter == 0){
                num = nums[i];
            }
            if(nums[i] == num){
                counter++;
            }
            else{
                counter--;
            }
        }
        return num;
    }
}