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
    private boolean balanced = true;

    public int dfs(TreeNode root) {
        if (root == null) {return 0;}

        int left = dfs(root.left);
        int right = dfs(root.right);
        
        if (Math.abs(right - left) > 1){
            balanced = false;
        }

        return Math.max(left,right) + 1;
        
    }
    
    public boolean isBalanced(TreeNode root) {
        dfs(root);
        return balanced;
    }
}
