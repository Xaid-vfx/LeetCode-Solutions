class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        return Math.max(helper(nums, 0 , nums.length - 2) , helper(nums, 1 , nums.length - 1));
    }
    public int helper(int[] nums, int start, int end){
        int i = start;
        int[] dp = new int[nums.length];
        while(i <= end){
            if(i < 2) dp[i] = nums[i];
            else if(i == 2) dp[i] = dp[i - 2] + nums[i];
            else dp[i] = Math.max(dp[i - 2], dp[i - 3]) + nums[i];
            i++;            
        }
        return Math.max(dp[end - 1], dp[end]);
    }
}