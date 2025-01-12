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
    public boolean hasPathSum(TreeNode node, int sum) {
        if(node == null){
            return false;
        }
        if(node.left == null && node.right ==null && sum == node.val){
            return true;
        }
        return hasPathSum(node.left,sum-node.val) || hasPathSum(node.right,sum-node.val);
    }
}