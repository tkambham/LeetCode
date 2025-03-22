class Solution {
    public String reverseWords(String s) {
        String work=s.trim();
        String[] words = work.split("\\s+");
        StringBuilder result = new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            result.append(words[i]).append(" ");
        }
        return result.toString().trim();
    }
}