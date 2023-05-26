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
    public void helper(TreeNode root, String temp, List<String> list){
        if (root == null){
            return;
        }
        if( root.left == null && root.right == null ){
            list.add(temp + root.val);
        }
        helper(root.left, temp + root.val + "->", list);
        helper(root.right, temp + root.val + "->", list);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList();
        helper(root, "", list);
        return list;
    }
}