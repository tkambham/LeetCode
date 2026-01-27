class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int n = nums.size();
        int breaks = 0;
        int pivot = -1;

        for (int i = 0; i < n - 1; i++) {
            if (nums.get(i) > nums.get(i + 1)) {
                breaks++;
                pivot = i;
            }
        }

        if (breaks == 0) {
            return 0;
        }

        if (breaks > 1 || nums.get(n - 1) > nums.get(0)) {
            return -1;
        }

        return n - 1 - pivot;
    }
}