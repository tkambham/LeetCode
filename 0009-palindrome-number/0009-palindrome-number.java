class Solution {
    public boolean isPalindrome(int x) {
        int temp=x;
        int pal=0;
        int r=0;
        while(temp>0){
            pal=(pal*10)+temp%10;
            temp=temp/10;
        }
        if(x==pal){
            return true;
        }
        else{
            return false;
        }
    }
}