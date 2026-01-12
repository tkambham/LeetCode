class Solution {
    public int hammingWeight(int n) {
        String binaryValue = Integer.toBinaryString(n);
        int count = 0;
        for(int i = 0;i<binaryValue.length();i++){
            if(binaryValue.charAt(i)=='1'){
                count++;
            }
        }
        return count;
    }
}