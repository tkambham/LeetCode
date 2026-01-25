class MyCalendar {
    List<List<Integer>> calendar;
    public MyCalendar() {
        calendar = new ArrayList<>();
    }
    
    public boolean book(int startTime, int endTime) {

        for (List<Integer> event : calendar) {
            int start = event.get(0);
            int end = event.get(1);

            if (startTime < end && endTime > start) {
                return false;
            }
        }

        calendar.add(Arrays.asList(startTime, endTime));
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */