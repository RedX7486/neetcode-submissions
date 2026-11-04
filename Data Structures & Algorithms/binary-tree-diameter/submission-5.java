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
    private int best = 0;

    public int dfs(TreeNode root) {
        int left = 0, right = 0;

        if (root.left != null){
            left = dfs(root.left);
        }
        if (root.right != null){
            right = dfs(root.right);
        }
        
        best = Math.max(best, left + right);

        return Math.max(left,right) + 1;
        
    }

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return best;
    }
}
