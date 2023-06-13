class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length, sum = 0, res = 0;
        HashMap<Integer, Integer> map = new HashMap();
        map.put(0, 1);
        for(int i = 0; i < n; i++){
            sum = sum + nums[i];
            if(map.containsKey(sum - k)){
                res = res + map.get(sum - k);
            }
             map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return res;
    }
}