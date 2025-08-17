class Solution {
    public int daysBetweenDates(String date1, String date2) {
        int y1 = Integer.parseInt(date1.substring(0, 4));
        int m1 = Integer.parseInt(date1.substring(5, 7));
        int d1 = Integer.parseInt(date1.substring(8));

        int y2 = Integer.parseInt(date2.substring(0, 4));
        int m2 = Integer.parseInt(date2.substring(5, 7));
        int d2 = Integer.parseInt(date2.substring(8));

        int totalDays1 = countDays(d1, m1, y1);
        int totalDays2 = countDays(d2, m2, y2);

        return Math.abs(totalDays1 - totalDays2);
    }

    public boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }

    public int monthDays(int month, int year) {
        switch (month) {
            case 1: return 31;
            case 2: return isLeapYear(year) ? 29 : 28;
            case 3: return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            case 12: return 31;
        }
        return 0;
    }

    public int countDays(int day, int month, int year) {
        int days = day;

        for (int i = 1; i < month; i++) {
            days += monthDays(i, year);
        }

        for (int i = 0; i < year; i++) {
            days += isLeapYear(i) ? 366 : 365;
        }

        return days;
    }
}
