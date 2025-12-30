class Solution {
    static int countSetBits(int n)
    {
        return Integer.bitCount(n);
    }
    public boolean canSortArray(int[] nums) {
        int i = 0;
        int n = nums.length;
        int[] sorted = nums.clone();
        Arrays.sort(sorted);
        while(i<n){
            int j = i;
            int bits = countSetBits(nums[i]);

            while (j < n && countSetBits(nums[j]) == bits) {
                j++;
            }

            int[] originalSegment = Arrays.copyOfRange(nums, i, j);
            int[] sortedSegment = Arrays.copyOfRange(sorted, i, j);

            Arrays.sort(originalSegment);
            Arrays.sort(sortedSegment);

            if (!Arrays.equals(originalSegment, sortedSegment)) {
                return false;
            }

            i = j;
        }
        return true;
    }
}