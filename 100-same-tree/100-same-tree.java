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
    boolean res = true;
    public void helper(TreeNode p, TreeNode q){
        if( p == null ^ q == null ){
            res = false;
        }
        if( p == null || q == null || res == false){
            return;
        }
        if ( p.val != q.val){
            res = false;
        }
        helper( p.left, q.left);
        helper( p.right, q.right);        
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        helper( p, q);
        return res;
    }
}