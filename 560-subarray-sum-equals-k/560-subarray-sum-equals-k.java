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
            if(map.containsKey(sum)) map.put(sum, map.get(sum) + 1);
            else map.put(sum, 1);
        }
        // System.out.println(map);
        return res;
    }
}