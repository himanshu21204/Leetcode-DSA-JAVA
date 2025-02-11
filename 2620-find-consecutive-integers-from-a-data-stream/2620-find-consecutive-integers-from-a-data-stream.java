class DataStream {
    int value;
    int k;
    int count;

    public DataStream(int value, int k) {
        this.value = value;
        this.k = k;
    }

    public boolean consec(int num) {
        if (value == num) {
            count++;
        } else {
            count = 0;
        }
        return count >= k;
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */