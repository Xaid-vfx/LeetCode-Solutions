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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList();
        List<Integer> temp = new ArrayList();
        if(root == null){
            return list;
        }
        q.add(root);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0; i < size; i++){
                TreeNode t = q.remove();
                if( t != null){
                    temp.add(t.val);
                    q.add(t.left);
                    q.add(t.right);
                }
            }
            if(temp.size() > 0){
                list.add(new ArrayList(temp));
                temp.clear();
            }
        }
        
        return list;
    }
}