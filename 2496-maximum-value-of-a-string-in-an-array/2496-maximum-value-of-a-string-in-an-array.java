class Solution {
    public int maximumValue(String[] strs) {
        int max = 0;
        for(int i = 0; i < strs.length; i++){
            int c = 0;
            if((int)strs[i].charAt(0)>57){
                c = strs[i].length();
            }
            else{
                int flag = 0;
                for(int j = 0; j<strs[i].length();j++){
                    if((int)strs[i].charAt(j)>57){
                        flag = 1;
                    }
                }
                if(flag == 0){
                    c = Integer.parseInt(strs[i]);
                }
                else{
                    c = strs[i].length();
                }
            }
            if(c > max){
                max = c;
            }
        }
        return max;
    }
}