class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int temp =n;
        for(int i = 0;i<flowerbed.length;i++){
            if(flowerbed[i]==0 && temp!=0){
                boolean prev = (i == 0 || flowerbed[i-1]==0);
                boolean next = (i == flowerbed.length-1 || flowerbed[i+1]==0);

                if(prev && next){
                    flowerbed[i]=1;
                    temp--;
                }
            }
            if(temp == 0){
                return true;
            }
        }
        return false;
    }
}