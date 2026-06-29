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
    int count=0;
    public int goodNodes(TreeNode root) {
        return dfs(root,root.val);
        
    }
    public int dfs(TreeNode node,int maxSoFar){
        if(node==null) return 0;
 
        if(node.val>=maxSoFar){
            maxSoFar= Math.max(maxSoFar,node.val);
            count++;
        }

        dfs(node.left,maxSoFar);
        dfs(node.right,maxSoFar);
        return count;

    }
}
