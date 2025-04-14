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
    public boolean isBalanced(TreeNode root) {
        int height = getheight(root);
        if(height==-1) return false;
        return true;
    }
    public int getheight(TreeNode root){
        if(root==null) return 0;
        int LSH=getheight(root.left);
        int RSH=getheight(root.right);
        if(LSH==-1 || RSH==-1) return -1;
        if(Math.abs(LSH-RSH)>1) return -1;
        return 1+Math.max(LSH,RSH);
    }
}