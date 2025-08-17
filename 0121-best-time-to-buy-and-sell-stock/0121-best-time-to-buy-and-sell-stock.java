class Solution {
    public int maxProfit(int[] prices) {
        int minValue = Integer.MAX_VALUE;
        int max = 0;

        for(int price : prices){
            if(price < minValue){
                minValue = price;
            }
            else if(price - minValue > max){
                max = price - minValue;
            }
        }

        return max;
    }
}