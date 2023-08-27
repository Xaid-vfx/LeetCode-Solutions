class Solution {
    public int help(int[] nums, int target, int n, int sum){
        if(n == 0 && target == sum) return 1; 
        if(n == 0) return 0; 

        return help(nums, target, n - 1, sum + nums[n - 1]) + help(nums, target, n - 1, sum - nums[n - 1]);
    }
    public int findTargetSumWays(int[] nums, int target) {
        return help(nums, target, nums.length, 0);
    }
}