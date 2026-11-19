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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean res = dfs(p, q);

        return res;
    }
    private boolean dfs(TreeNode a, TreeNode b){
        if(a == null && b == null) return true;
        if((a == null && b != null) || (b == null && a != null)) return false;
        if(a.val != b.val) return false;
        boolean ab = dfs(a.left, b.left);
        boolean bb = dfs(a.right, b.right);
        return (ab == true && bb == true);
    }


}
