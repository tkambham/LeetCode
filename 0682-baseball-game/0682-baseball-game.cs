public class Solution {
    public int CalPoints(string[] operations) {
            List<int> nums = new List<int>();
        foreach( var operation in operations){
            if(operation == "C"){
                nums.RemoveAt(nums.Count-1);
            }
            else if(operation == "D"){
                nums.Add(nums[nums.Count-1]*2);
            }
            else if(operation == "+"){
                nums.Add(nums[nums.Count-1]+nums[nums.Count-2]);
            }
            else{
                nums.Add(int.Parse(operation));
            }
        }
        return nums.Sum();
    }
}