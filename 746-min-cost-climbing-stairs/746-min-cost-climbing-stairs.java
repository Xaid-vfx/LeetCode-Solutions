class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int i = cost.length - 1, sum = 0;
        int[] dp = new int[cost.length];
        while( i >= 0){
            if(i > cost.length - 3) dp[i] = cost[i];
            else dp[i] = cost[i] + Math.min(dp[i + 1], dp[i + 2]);
            i--;
        }
        return Math.min(dp[0], dp[1]);
    }
}