class Solution {
    public String findLatestTime(String s) {
        String res = "";
        if(s.charAt(0)=='?'){
            if(s.charAt(1)=='0' || s.charAt(1)=='1' || s.charAt(1)=='?'){
                res = res + '1';
            }
            else{
                res = res + '0';
            }
        }
        else{
            res = res + s.charAt(0);
        }
        if(s.charAt(1)=='?'){
            if(res.charAt(0)=='1'){
                res = res + '1';
            }
            else{
                res = res + '9';
            }
        }
        else{
            res = res + s.charAt(1);
        }
        res = res + ':';
        if(s.charAt(3)=='?'){
            res = res + '5';
        }
        else{
            res = res + s.charAt(3);
        }
        if(s.charAt(4)=='?'){
            res = res + '9';
        }
        else{
            res = res + s.charAt(4);
        }
        return res;
    }
}