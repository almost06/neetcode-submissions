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
        ArrayDeque<TreeNode> q = new ArrayDeque<>();
        ArrayList<List<Integer>> list = new ArrayList<>();
        if(root == null) return list; 
        q.offer(root);
        int amount = 1;
        while(!q.isEmpty()){ 
            ArrayList<Integer> l = new ArrayList<>();
            int countEntered = 0;
            for(int i = 0; i < amount ; i++){
                var p = q.poll();
                l.add(p.val);
                if(p.left != null){ q.offer(p.left);countEntered++;}
                if(p.right != null) {q.offer(p.right); countEntered++;}
            }
            list.add(l);
            amount = countEntered;
        }

        return list; 
    }
}
