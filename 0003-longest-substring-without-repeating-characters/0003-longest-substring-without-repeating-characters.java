class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int max = 0;
        for(int i =0;i<s.length();i++){
            int c =0;
            List<Character> res = new ArrayList<>();
            for(int j = i;j<s.length();j++){
                if(res.contains(s.charAt(j))){
                    break;
                }
                else{
                    res.add(s.charAt(j));
                    c++;
                }
            }
            if(c>max){
                max = c;
            }
        }
        return max;
    }
}