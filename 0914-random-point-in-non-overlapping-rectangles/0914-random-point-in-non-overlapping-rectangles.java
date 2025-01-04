class Solution {
    Random random;
    TreeMap<Integer,int[]> map;
    int areaSum = 0;
    public Solution(int[][] rects) {
        this.random = new Random();
        this.map = new TreeMap<>();

        for (int[] coordinates : rects) {
            int length = coordinates[2] - coordinates[0] + 1;
            int breadth = coordinates[3] - coordinates[1] + 1;

            areaSum += length * breadth;

            map.put(areaSum, coordinates);
        }
    }
    
    public int[] pick() {
        int key = map.ceilingKey(random.nextInt(areaSum) + 1);

        int [] rectangle = map.get(key);

        int length = rectangle[2] - rectangle[0] + 1 ;
        int breadth = rectangle[3] - rectangle[1] + 1 ;

        int x = rectangle[0] + random.nextInt(length);
        int y = rectangle[1] + random.nextInt(breadth);

        return new int[]{x,y};
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(rects);
 * int[] param_1 = obj.pick();
 */