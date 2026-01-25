class Solution {
    public boolean digitCount(String num) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0;i<num.length();i++){
            int n = Character.getNumericValue(num.charAt(i));
            map.put(n, map.getOrDefault(n, 0)+1);
        }

        for(int i = 0;i<num.length();i++){
            int expected = num.charAt(i) - '0';
            int actual = map.getOrDefault(i, 0);

            if (expected != actual) {
                return false;
            }
        }
        return true;
    }
}