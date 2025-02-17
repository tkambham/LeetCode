class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length -1;
        System.out.println("left is " + left + "right is " + right);
        while(left<right){
            int cHeight = Math.min(height[left], height[right]);
            int cArea = (right-left) * cHeight;

            maxArea = Math.max(maxArea, cArea);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}