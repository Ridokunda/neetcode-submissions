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
    private int count;
    public int kthSmallest(TreeNode root, int k) {
        count = k;
        return dfs(root);
    }
    private int dfs(TreeNode root){
        if(root == null){
            return -1;
        }
        int left = dfs(root.left);
        count--;
        if(count == 0){
            return root.val;
        }
        if(left != -1){
            return left;
        }
        return dfs(root.right);
    }
}
