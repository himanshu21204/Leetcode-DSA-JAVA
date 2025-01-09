class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];
                if (num != '.') {
                    String row = "row" + i + num;
                    String col = "col" + j + num;
                    String grid = "grid" + (i / 3) + (j / 3) + num;
                    if (!seen.add(row) || !seen.add(col) || !seen.add(grid)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}