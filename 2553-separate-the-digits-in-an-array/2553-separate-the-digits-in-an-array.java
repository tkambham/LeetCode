class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for (int num : nums) {
            String s = Integer.toString(num);
            for (char c : s.toCharArray()) {
                list.add(c - '0');
            }
        }
        int[] result = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            result[i] = list.get(i);
        }
        return result;
    }
}