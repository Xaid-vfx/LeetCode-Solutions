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
    boolean res = false; 
    HashMap <Integer, Integer> map = new HashMap();
    public boolean findTarget(TreeNode root, int k) {
        if(root == null) return false;
        findTarget(root.left, k);
        if(map.containsKey(k - root.val)) res = true;    
        map.put(root.val, root.val);    
        findTarget(root.right, k);
        return res;
    }
}