class Solution {
    public int[] singleNumber(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            if(res.contains(nums[i])){
                res.remove(Integer.valueOf(nums[i]));
            }
            else{
                res.add((nums[i]));
            }
        }
        int[] opt = new int[res.size()];
        for(int i=0;i<res.size();i++){
            opt[i] = res.get(i);
        }
        return opt;
    }
}