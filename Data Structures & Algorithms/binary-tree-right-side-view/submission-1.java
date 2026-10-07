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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayDeque<TreeNode> q = new ArrayDeque<>(); 
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return list;

        q.add(root);
        list.add(root.val);
        int amount = 1; 
        while(!q.isEmpty()){
            for(int i = 0; i < amount; i++){
                var x = q.poll();
                if(x.left != null) q.add(x.left);
                if(x.right != null) q.add(x.right);                
            }
            if(!q.isEmpty()){list.add(q.peekLast().val); amount = q.size();}
        }
        return list;
    }

    
}
