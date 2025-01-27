class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int sum = 0;
        for(int i = 0;i < operations.length;i++){
            if(operations[i].equals("C")){
                nums.remove(nums.size()-1);
            }
            else if(operations[i].equals("D")){
                nums.add(nums.get(nums.size()-1)*2);
            }
            else if(operations[i].equals("+")){
                nums.add(nums.get(nums.size()-1)+nums.get(nums.size()-2));
            }
            else{
                nums.add(Integer.parseInt(operations[i]));
            }
        }
        for(int i=0;i<nums.size();i++){
            sum += nums.get(i);
        }
        return sum;
    }
}