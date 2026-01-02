class Solution {
    public int largestInteger(int num) {
        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();
        int temp = num;
        while(temp>0){
            int rem = temp%10;
            if(rem%2 == 0){
                evenList.add(rem);
            }
            else{
                oddList.add(rem);
            }
            temp = temp/10;
        }

        Collections.sort(oddList);
        Collections.sort(evenList);

        temp = num;
        int i = 0;
        int j = 0;

        int result = 0;

        int place = 1;

        while (temp > 0) {
            int rem = temp % 10;

            if (rem % 2 == 0) {
                result += evenList.get(i) * place;
                i++;
            } else {
                result += oddList.get(j) * place;
                j++;
            }

            place *= 10;
            temp = temp / 10;
        }
        return result;
    }
}