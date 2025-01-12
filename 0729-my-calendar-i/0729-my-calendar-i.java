class MyCalendar {
    public List<int[]> cl;
    public MyCalendar() {
        cl = new ArrayList<>();
    }
    
    public boolean book(int start, int end) {
        for (int[] event : cl) {
            if (event[0] < end && start < event[1]) {
                return false;
            }
        }
        cl.add(new int[]{start, end});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */