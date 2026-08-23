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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null){
            return false;
        }
        LinkedList<TreeNode>node_stack = new LinkedList<>();
        LinkedList<Integer>sum_track = new LinkedList<>();
        node_stack.add(root);
        sum_track.add(targetSum - root.val);
        TreeNode node = null;
        int curr_sum = 0;
        while(!node_stack.isEmpty()){
            node = node_stack.pollLast();
            curr_sum = sum_track.pollLast();
            if((node.right==null) && (node.left==null) && curr_sum==0){
                return true;
            }
            if(node.left!=null){
                node_stack.add(node.left);
                sum_track.add(curr_sum - node.left.val);
            }
            if(node.right!=null){
                node_stack.add(node.right);
                sum_track.add(curr_sum - node.right.val);
            }
        }
        return false;
    }
}