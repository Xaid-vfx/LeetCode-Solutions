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
    public void helper(TreeNode root, StringBuilder temp, List<String> list){
        if (root == null){
            return;
        }
        int len = temp.length();
        temp.append(root.val);
        if( root.left == null && root.right == null ){
            list.add(temp.toString());
        }
        temp.append("->");
        helper(root.left, temp , list);
        helper(root.right, temp , list);
        temp.setLength(len);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList();
        StringBuilder temp = new StringBuilder();
        helper(root, temp, list);
        return list;
    }
}