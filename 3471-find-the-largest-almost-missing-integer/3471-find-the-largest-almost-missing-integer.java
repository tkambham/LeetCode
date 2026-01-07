class Solution {
    public int largestInteger(int[] nums, int k) {
        Map<Integer, Boolean> map = new HashMap<>();

        for (int i = 0; i <= nums.length - k; i++) {
            Set<Integer> seenInWindow = new HashSet<>();

            for (int j = i; j < i + k; j++) {
                seenInWindow.add(nums[j]);
            }
            for (int num : seenInWindow) {
                if (!map.containsKey(num)) {
                    map.put(num, true);
                } else {
                    map.put(num, false);
                }
            }
        }

        int ans = -1;
        for (int key : map.keySet()) {
            if (map.get(key)) {
                ans = Math.max(ans, key);
            }
        }
        return ans;
    }
}