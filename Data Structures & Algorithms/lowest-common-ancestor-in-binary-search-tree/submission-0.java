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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;

        if(root.val==p.val || root.val==q.val) return root;

        TreeNode leftSubtree=null;
        TreeNode rightSubtree=null;
        if(root.val>p.val || root.val> q.val){
            leftSubtree= lowestCommonAncestor(root.left,p,q);
        }
        if(root.val<q.val || root.val<p.val){
             rightSubtree=lowestCommonAncestor(root.right,p,q);
        }

        
        if(leftSubtree !=null && rightSubtree!=null){
            return root;
        }
        if(leftSubtree!=null && rightSubtree==null){
            return leftSubtree;
        }
        if(leftSubtree==null && rightSubtree!=null){
            return rightSubtree;
        }
      
        return null;
    }
}
