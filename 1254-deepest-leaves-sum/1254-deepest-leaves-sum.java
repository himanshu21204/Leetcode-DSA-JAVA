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
    public int deepestLeavesSum(TreeNode root) {
        int height = height(root);
        int ans = findSum(root,0,height);
        return ans;
    }
    int height(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);

        return Math.max(left,right) + 1;
    }
    int findSum(TreeNode root, int currentDepth, int height) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null && currentDepth == height-1) {
            return root.val;
        }
        int leftSum = findSum(root.left, currentDepth + 1, height);
        int rightSum = findSum(root.right, currentDepth + 1, height);

        return leftSum + rightSum;
    }
}