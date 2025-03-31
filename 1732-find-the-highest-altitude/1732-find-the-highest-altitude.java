class Solution {
    public int largestAltitude(int[] gain) {
        int maxVal = 0;
        for(int i = 1;i<gain.length;i++){
            gain[i] = gain[i-1]+gain[i];
            maxVal = Math.max(Math.max(gain[i-1], gain[i]), maxVal);
        }
        if(gain.length == 1){
            maxVal = Math.max(maxVal, gain[0]);
        }
        return maxVal;
    }
}