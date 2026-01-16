class Solution {
    public String getBelowThousandValue(int num) {
        if (num == 0) return "";

        String[] belowTen = {
            "", "One", "Two", "Three", "Four",
            "Five", "Six", "Seven", "Eight", "Nine"
        };

        String[] belowTwenty = {
            "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
            "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
        };

        String[] tens = {
            "", "", "Twenty", "Thirty", "Forty",
            "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
        };

        StringBuilder result = new StringBuilder();

        if (num >= 100) {
            result.append(belowTen[num / 100]).append(" Hundred");
            num %= 100;
            if (num > 0) result.append(" ");
        }

        if (num >= 20) {
            result.append(tens[num / 10]);
            if (num % 10 != 0) {
                result.append(" ").append(belowTen[num % 10]);
            }
        } else if (num >= 10) {
            result.append(belowTwenty[num - 10]);
        } else if (num > 0) {
            result.append(belowTen[num]);
        }

        return result.toString();
    }
    public String numberToWords(int num) {

         if (num == 0) return "Zero";
        if(num<1000){
            return getBelowThousandValue(num);
        }

        int temp = num;
        int i = 0;
        String englishValue = "";

        String[] forEveryThousand = {
            "", "Thousand ", "Million ", "Billion "
        };

        while (temp > 0) {
            int val = temp % 1000;

            if (val != 0) {
                englishValue =
                    getBelowThousandValue(val) +
                    " " +
                    forEveryThousand[i] +
                    englishValue;
            }

            temp /= 1000;
            i++;
        }

        return englishValue.trim();
    }
}