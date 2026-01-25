class Solution {
    public int minimumOperations(int[] nums) {
        int operations = 0;

        for(int num : nums){
            if(num%3 == 1){
                operations++;
            }
            else if(num%3 == 2){
                operations++;
            }
        }

        return operations;
    }
}