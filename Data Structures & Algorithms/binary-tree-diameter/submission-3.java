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

        int temp = left+right;
        if (best < temp){
            best = temp;
        }

        if (left >= right){
            return left +1;
        }
        return right +1;
        
    }

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root);
        return best;
    }
}
