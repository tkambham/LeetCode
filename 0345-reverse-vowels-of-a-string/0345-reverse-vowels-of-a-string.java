class Solution {
    public String reverseVowels(String s) {
        List<Character> vowels = new ArrayList<>();
        String result = "";
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)=='A' || s.charAt(i)=='a' || s.charAt(i)=='E' || s.charAt(i)=='e' || s.charAt(i)=='I' || s.charAt(i)=='i' || s.charAt(i)=='O' || s.charAt(i)=='o' || s.charAt(i)=='U' || s.charAt(i)=='u'){
                vowels.add(s.charAt(i));
            }
        }
        int j = 0;
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='A' || s.charAt(i)=='a' || s.charAt(i)=='E' || s.charAt(i)=='e' || s.charAt(i)=='I' || s.charAt(i)=='i' || s.charAt(i)=='O' || s.charAt(i)=='o' || s.charAt(i)=='U' || s.charAt(i)=='u'){
                result =result+vowels.get(j);
                j++;
            }
            else{
                result = result+s.charAt(i);
            }
        }
        return result;
    }
}