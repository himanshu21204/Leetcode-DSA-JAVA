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
    public List<String> binaryTreePaths(TreeNode root) {
        return ans(root,"");
    }
    List<String> ans(TreeNode node,String s){
        if(node.left == null && node.right == null) {
            List<String> temp = new ArrayList<>();
            temp.add(s + node.val);
            return temp;
        }
        List<String> list = new ArrayList<>();
        if(node.left != null){
            list.addAll(ans(node.left,s + node.val + "->"));
        }
        if(node.right != null){
            list.addAll(ans(node.right,s + node.val + "->"));
        }
        return list;
    }
}