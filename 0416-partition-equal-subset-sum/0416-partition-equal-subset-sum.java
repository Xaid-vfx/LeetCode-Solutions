class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + nums[i];
        }
        if(sum % 2 == 1) return false;
        else return subsetSum(nums, nums.length, sum / 2, new Boolean[nums.length + 1][sum/2 + 1]);
    }
    public boolean subsetSum(int[] nums, int n, int sum, Boolean[][] dp){
        if( sum == 0 ) return true;
        if( n == 0 || sum < 0) return false;

        if(dp[n][sum] != null) return dp[n][sum];

        return dp[n][sum] = subsetSum(nums, n - 1, sum - nums[n - 1], dp) || subsetSum(nums, n - 1, sum, dp);
    }
}