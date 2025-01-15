class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        long result = 0;
        for(int i=0; i<n; i++)
        {
            int sum = 0;
            for(int j=i; j<n; j++)
            {
                sum = sum+nums[j];
                arr.add(sum);
            }
        }
        Collections.sort(arr);
        for(int i=left-1; i<right;i++){
            result = result+arr.get(i);
        }
        return (int)(result % (1000000007));
    }
}