class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        
        for (int i = 0; i < matrix.length; i++) {
            int min = Integer.MAX_VALUE;
            int mini = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (min > matrix[i][j]) {
                    min = matrix[i][j];
                    mini = j;
                }
            }
            if (isLucky(matrix, min, mini)) {
                list.add(min);
            }
        }
        
        return list;
    }

    boolean isLucky(int[][] arr, int min, int mini) {
        for (int i = 0; i < arr.length; i++) {
            if (min < arr[i][mini]) {
                return false;
            }
        }
        return true;
    }
}