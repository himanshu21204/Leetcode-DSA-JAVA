class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int rows = isWater.length;
        int cols = isWater[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int[][] height = new int[rows][cols];
        for(int i = 0 ; i < rows ; i++) {
            for(int j = 0 ; j < cols ; j++) {
                if(isWater[i][j] == 1) {
                    queue.offer(new int[]{i , j});
                    height[i][j] = 0;
                }else{
                    height[i][j] = -1;
                }
            }
        }
        int[] dx = {0, 0, 1, -1};
        int[] dy = {1, -1, 0, 0};
        while (!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0 ; i < size ; i++) {
                int[] point = queue.poll();
                for(int j = 0;j<4;j++) {
                    int x = point[0] + dx[j];
                    int y = point[1] + dy[j];

                    if(x < 0 || y < 0 || x >= rows || y >= cols || height[x][y] != -1) continue;

                    height[x][y] = height[point[0]][point[1]] + 1;
                    queue.offer(new int[]{x , y});
                }
            }
        }
        return height;
    }
}