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
    public int sumNumbers(TreeNode root) {
        return helper(root, new StringBuilder());
    }
    int helper(TreeNode node, StringBuilder sb) {
        if (node == null) {
            return 0;
        }
        sb.append(node.val);
        if (node.left == null && node.right == null) {
            int num = Integer.parseInt(sb.toString());
            sb.deleteCharAt(sb.length() - 1);
            return num;
        }
        int leftSum = helper(node.left, sb);
        int rightSum = helper(node.right, sb);
        sb.deleteCharAt(sb.length() - 1);
        return (leftSum + rightSum);
    }
}