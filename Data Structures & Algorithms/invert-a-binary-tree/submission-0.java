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
    public TreeNode invertTree(TreeNode root) {
        TreeNode cur = root;
        inorder(cur);
        return root;
    }
    private void inorder(TreeNode node){
        if(node == null){
            return;
        }
        inorder(node.left);
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        inorder(node.left);
    }
}
