class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> distinctSet1 = new HashSet<>();
        Set<Integer> distinctSet2 = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        for(int i : nums1){
            distinctSet1.add(i);
        }
        for(int i : nums2){
            distinctSet2.add(i);
        }
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for(int val : distinctSet1){
            if(!distinctSet2.contains(val)){
                list1.add(val);
            }
        }
        for(int val : distinctSet2){
            if(!distinctSet1.contains(val)){
                list2.add(val);
            }
        }
        result.add(list1);
        result.add(list2);
        return result;
    }
}