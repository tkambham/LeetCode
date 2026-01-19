class Solution {
    public int gcdOfOddEvenSums(int n) {
        int oddSum = 0;
        int evenSum = 0;

        for(int i = 1;i<(n*2)+1;i++){
            if(i%2==0){
                evenSum += i;
            }
            else{
                oddSum += i;
            }
        }

        for(int i = oddSum; i>1;i--){
            if(evenSum%i == 0 && oddSum%i == 0){
                return i;
            }
        }

        return 1;
    }
}