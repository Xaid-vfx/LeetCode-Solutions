class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp = new int[amount + 1][coins.length + 1];

        for(int i = 1; i < amount + 1; i++){
            dp[i][0] = 0;
        }
        for(int i = 1; i < coins.length + 1; i++){
            dp[0][i] = 1;
        }

        for(int i = 1; i < amount + 1; i++){
            for(int j = 1; j < coins.length + 1; j++){
                if(i - coins[j - 1] >= 0)
                    dp[i][j] = dp[i - coins[j - 1]][j] + dp[i][j - 1];
                else
                    dp[i][j] = dp[i][j - 1];
            }
        }
        return dp[amount][coins.length];
    }
}