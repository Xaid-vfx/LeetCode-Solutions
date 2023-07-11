class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        int[] dp = new int[nums.length];
        int i = 0;
        while(i < nums.length){
            if(i < 2) dp[i] = nums[i];
            else if(i == 2) dp[i] = dp[ i - 2] + nums[i];
            else dp[i] = Math.max(dp[i - 2], dp[i - 3]) + nums[i];
            i++;
        }
        return Math.max(dp[nums.length - 1], dp[nums.length - 2]);
    }
}