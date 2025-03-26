class Solution {
    public boolean isSubsequence(String s, String t) {
        StringBuilder t1 = new StringBuilder(t);
        int temp = -1;
        int c = 0;
        for(int i = 0;i<s.length();i++){
            temp = t.indexOf(s.charAt(i), temp + 1);
            if(temp == -1){
                return false;
            }
        }
        return true;
    }
}