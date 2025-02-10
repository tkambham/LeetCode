class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count=0;
        if(ruleKey.equals("type")){
            for(List<String> list : items){
                if(ruleValue.equals(list.get(0))){
                    count++;
                }
            }
        }
        else if(ruleKey.equals("color")){
            for(List<String> list : items){
                if(ruleValue.equals(list.get(1))){
                    count++;
                }
            }
        }
        else if(ruleKey.equals("name")){
            for(List<String> list : items){
                if(ruleValue.equals(list.get(2))){
                    count++;
                }
            }
        }
        return count;
    }
}