/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int ans = 0;
    public int countPairs(TreeNode root, int distance) {
        dfs(root, distance);
        return ans;
    }
    private List<Integer> dfs(TreeNode node, int distance) {
        if (node == null) return new ArrayList<>();
        if (node.left == null && node.right == null) {
            List<Integer> leaf = new ArrayList<>();
            leaf.add(0);
            return leaf;
        }

        List<Integer> leftDistances = dfs(node.left, distance);
        List<Integer> rightDistances = dfs(node.right, distance);

        for (int l : leftDistances) {
            for (int r : rightDistances) {
                if (l + r + 2 <= distance) {
                    ans++;
                }
            }
        }

        List<Integer> distances = new ArrayList<>();
        for (int d : leftDistances) distances.add(d + 1);
        for (int d : rightDistances) distances.add(d + 1);

        return distances;
    }
}