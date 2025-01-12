/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution {
    // List<Integer> list = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode node) {
        // pre(root);
        // return list;
        if(node == null){
            return new ArrayList<>();
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(node);
        List<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()){
            TreeNode temp = stack.pop();
            list.add(temp.val);
            if(temp.right != null){
                stack.push(temp.right);
            }
            if(temp.left != null){
                stack.push(temp.left);
            }
        }
        return list;
    }

    // void pre(TreeNode root) {
    //     if (root == null) {
    //         return;
    //     }
    //     list.add(root.val);
    //     pre(root.left);
    //     pre(root.right);
    // }
}