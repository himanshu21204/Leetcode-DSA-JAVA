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
    public boolean isCousins(TreeNode root, int x, int y) {
        return (level(root, x, 1) == level(root, y, 1)) && !isSibling(root, x, y);
    }

    int level(TreeNode node, int val, int level) {
        if (node == null) return 0;
        if (node.val == val) return level;
        int left = level(node.left, val, level + 1);
        if (left != 0) return left;
        return level(node.right, val, level + 1);
    }
    boolean isSibling(TreeNode node, int x, int y) {
        if (node == null) return false;

        boolean isDirectSibling = (node.left != null && node.right != null) &&
                ((node.left.val == x && node.right.val == y) ||
                        (node.left.val == y && node.right.val == x));

        return isDirectSibling || isSibling(node.left, x, y) || isSibling(node.right, x, y);
    }
}