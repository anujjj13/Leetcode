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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> node = new ArrayList<>();
        inorder(root,node);
        return node;
    }
    private void inorder(TreeNode root , List<Integer> node){
        if(root==null) return;
        inorder(root.left , node);
        node.add(root.val);
        inorder(root.right , node);
    }
}