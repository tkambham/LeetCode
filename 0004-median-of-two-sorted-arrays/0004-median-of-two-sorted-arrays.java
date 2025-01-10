class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        List<Integer> numsR = new ArrayList<Integer>();
        int i = 0;
        int j = 0;

        while(i < m && j < n){
            if(nums1[i] < nums2[j]){
                numsR.add(nums1[i]);
                i++;
            }
            else{
                numsR.add(nums2[j]);
                j++;
            }
        }

        while(i<m){
            numsR.add(nums1[i]);
            i++;
        }
        while(j<n){
            numsR.add(nums2[j]);
            j++;
        }

        double result;
        if((m+n)%2==0){
            result = (numsR.get((m+n)/2)+numsR.get(((m+n)/2)-1))/2.0;
        }
        else{
            result = numsR.get((m+n)/2);
        }

        return result;
    }
}