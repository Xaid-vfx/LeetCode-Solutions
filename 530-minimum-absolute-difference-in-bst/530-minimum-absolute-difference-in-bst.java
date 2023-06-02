
class Solution {
    Integer res = Integer.MAX_VALUE, pre = null;
    public int getMinimumDifference(TreeNode root) {
        if (root.left != null) getMinimumDifference(root.left);
        if (pre != null) res = Math.min(res, root.val - pre);
        pre = root.val;
        if (root.right != null) getMinimumDifference(root.right);
        return res;
    }
}