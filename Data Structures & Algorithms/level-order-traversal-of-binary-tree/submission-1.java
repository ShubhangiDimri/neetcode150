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
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> list= new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();

        if(root==null) return list;

        q.add(root);

        while(!q.isEmpty()){
            int currLevel= q.size();
            List<Integer> level= new ArrayList<>();

            for(int i=0;i<currLevel;i++){
                if(q.peek().left!=null) q.add(q.peek().left);
                if(q.peek().right!=null) q.add(q.peek().right);
                level.add(q.poll().val);
            }

            list.add(level);

        }
        return list;
    }
}
