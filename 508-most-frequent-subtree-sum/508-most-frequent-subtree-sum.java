class Solution {
    int maxValue = 0;
    HashMap <Integer, Integer> map = new HashMap();
    public int sum(TreeNode root){
        if(root == null) return 0;
        int left = sum(root.left);
        int right = sum(root.right);
        int s = left + right + root.val;
        map.put(s , map.getOrDefault(s, 0) + 1);
        maxValue = Math.max(maxValue, map.get(s));
        return s;
    }
    public int[] findFrequentTreeSum(TreeNode root) {
        sum(root);
        List<Integer> keysWithMaxValue = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValue) {
                keysWithMaxValue.add(entry.getKey());
            }
        }
        int[] arr = new int[keysWithMaxValue.size()];
        for(int i = 0; i < keysWithMaxValue.size(); i++){
            arr[i] = keysWithMaxValue.get(i);
        }
        return arr;
    }
}