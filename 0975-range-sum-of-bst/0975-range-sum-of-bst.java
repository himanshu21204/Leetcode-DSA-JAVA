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
    int sum = 0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        Preorder(root,low,high);
        return sum;
    }
    public void Preorder(TreeNode node, int low, int high){
        if(node == null) return;
        if(node.val >= low && node.val <= high){
            sum += node.val;
        }
        Preorder(node.left,low,high);
        Preorder(node.right,low,high);
    }
}