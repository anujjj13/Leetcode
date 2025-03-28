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
    public List<Integer> postorderTraversal(TreeNode root) {
    List<Integer> node = new ArrayList<>();
        postorder(root,node);
        return node;
    }
    private void postorder(TreeNode root , List<Integer> node){
        if(root==null) return;
        postorder(root.left , node);
        postorder(root.right , node);
        node.add(root.val);
    }
}