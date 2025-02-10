class Solution {
    public int search(int[] nums, int target) {
        int flag=0;
        int i=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==target){
                flag=1;
                break;
            }
        }
        if(flag!=0){
            return i;
        }
        else{
            return -1;
        }
    }
}