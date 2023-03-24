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
        ArrayList<Integer> list = new ArrayList<Integer>();  
        Stack<TreeNode> stack = new Stack<TreeNode>();

        while( !stack.empty() || root != null){ //For coming up
            while( root != null ){ //For going down
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            list.add(root.val);
            root = root.right; 
            /* Right to check if there is right child of the root node, if no right child root=
            null and the upper root node will be popped out till a right child in found*/
        }
        return list;
    }
}