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
        ArrayDeque<TreeNode> stack = new ArrayDeque<>(); 
        ArrayList<Integer> list = new ArrayList<>();
        if(root == null) return list;

        stack.add(root);
        list.add(root.val);
        int amount = 1; 
        while(!stack.isEmpty()){
            for(int i = 0; i < amount; i++){
                var x = stack.poll();
                if(x.left != null) stack.add(x.left);
                if(x.right != null) stack.add(x.right);                
            }
            if(!stack.isEmpty()){list.add(stack.peekLast().val); amount = stack.size();}
        }
        return list;
    }

    
}
