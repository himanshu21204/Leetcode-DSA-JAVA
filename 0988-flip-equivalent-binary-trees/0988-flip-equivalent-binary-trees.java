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
    public boolean flipEquiv(TreeNode x, TreeNode y) {
        if(x==null && y==null) return true;
        if(x==null || y==null) return false;
        if(x.val != y.val) return false;
        
        if(flipEquiv(x.left,y.left) && flipEquiv(x.right,y.right)) return true;
        return flipEquiv(x.left, y.right) && flipEquiv(x.right, y.left);
    }
}