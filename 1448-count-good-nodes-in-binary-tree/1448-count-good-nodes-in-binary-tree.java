 class Solution {
     int res = 0;
    public int goodNodes(TreeNode root) {
        helper(root, Integer.MIN_VALUE);
        return res;
    }
    public void helper(TreeNode root, int max){
        if(root == null) return;
        if(root.val >= max) res++;
        max = Math.max(max, root.val);
        helper(root.left, max);
        helper(root.right, max);
    }
}