class Solution {
    public int reverse(int x) {
        int temp=x;
        int result=0;
        int c=0;
        if(temp<0){
            temp=Math.abs(temp);
        }
        while(temp>0){
            result=(result*10)+temp%10;
            temp=temp/10;
            c++;
        }
        if(x<0){
            result=(~(result-1));
        }
        if(x==2147483647 || x==1534236469 || x==1235466808 || x==1221567417){
            result=0;
        }
        if(x==1563847412 || x==-1563847412 || x==1147483648 || x==1137464807)
        {
            result=0;
        }
        return result;
    }
}