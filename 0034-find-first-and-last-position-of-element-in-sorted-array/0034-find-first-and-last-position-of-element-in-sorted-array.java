class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res=new int[2];
        if(nums.length==0){
            res[0]=-1;
            res[1]=-1;
        }
        else{
            for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                res[0]=i;
                break;
            }
            else{
                res[0]=-1;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==target){
                res[1]=i;
                break;
            }
            else{
                res[1]=-1;
            }
        }
        }
        return res;
    }
}