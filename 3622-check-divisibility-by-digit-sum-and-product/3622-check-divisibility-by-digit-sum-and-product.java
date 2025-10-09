class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int temp = n;
        while(temp>0){
            int value = temp%10;
            sum += value;
            prod *= value;
            temp = temp/10;
        }
        if(n%(sum+prod) == 0){
            return true;
        }
        return false;
    }
}