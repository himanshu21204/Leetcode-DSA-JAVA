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
    public String tree2str(TreeNode root) {
        if(root == null){
            return "";
        }
        String s = String.valueOf(root.val);
        if(root.left != null || root.right != null){
            s += "(" + tree2str(root.left) + ")";
        }
        if(root.right != null){
            s += "(" + tree2str(root.right) + ")";
        }
        return s;  
    }
}