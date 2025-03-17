class Solution {
    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> dict = new HashMap<>();
        for(int i=0;i<text.length();i++){
            dict.put(text.charAt(i), dict.getOrDefault(text.charAt(i),0)+1);
        }
        return Math.min(Math.min(dict.getOrDefault('b', 0),dict.getOrDefault('a', 0)),Math.min(dict.getOrDefault('n', 0), Math.min(dict.getOrDefault('o', 0)/2,dict.getOrDefault('l', 0)/2)));
    }
}