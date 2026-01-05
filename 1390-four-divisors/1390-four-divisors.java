class Solution {
    public static List<Integer> findDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        int sum = 0;
        int count = 0;
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    count++;
                    sum += i;
                } else {
                    sum += i;
                    sum += n/i;
                    count+=2;
                }
            }
        }
        divisors.add(count);
        divisors.add(sum);
        return divisors;
    }
    public int sumFourDivisors(int[] nums) {
        int divisorsSum = 0;

        for(int i : nums){
            List<Integer> divisors = findDivisors(i);
            System.out.println(divisors);
            if(divisors.get(0) == 4){
                divisorsSum += divisors.get(1);
            }
        }
        
        return divisorsSum;
    }
}