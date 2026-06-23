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
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        int curr= maxDepth(root.left)+maxDepth(root.right);
        int leftDia= diameterOfBinaryTree(root.left);
        int rightDia=diameterOfBinaryTree(root.right);
        return Math.max(curr, Math.max(leftDia,rightDia));
        
    }
    public int maxDepth(TreeNode root){
        if(root==null) return 0;
        int lh= maxDepth(root.left);
        int rh= maxDepth(root.right);
        return 1+Math.max(lh,rh);
    }
}
