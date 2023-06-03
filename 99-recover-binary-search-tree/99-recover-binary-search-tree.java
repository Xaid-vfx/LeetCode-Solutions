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
    int pre = Integer.MIN_VALUE, flag = 0; TreeNode swap, pnode;
    public void helper(TreeNode root){
        if(root == null) return;
        helper(root.left);
        if(swap != null && swap.val < root.val && flag == 0){
            int temp = swap.val;
            swap.val = pre;
            pnode.val = temp; 
            flag = 1;
        }
        else if(pre > root.val && swap == null){
            swap = pnode;
            swap.val = pre;
        }
        pre = root.val;
        pnode = root;
        helper(root.right);
    }
    public void recoverTree(TreeNode root) {
        helper(root);
        if(flag == 0){
            int temp = swap.val;
            swap.val = pre;
            pnode.val = temp; 
        }
    }
}