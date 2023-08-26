class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int x = text1.length();
        int y = text2.length();
        int[][] dp = new int[x + 1][y + 1];

        for(int a = 0; a < text1.length() + 1; a++)
            for(int b = 0; b < text2.length() + 1; b++){
                if(a == 0 || b == 0) dp[a][b] = 0;
                else{
                    if( text1.charAt(a - 1) == text2.charAt(b - 1) )
                        dp[a][b] = 1 + dp[a - 1][b - 1];
                    else
                        dp[a][b] = Math.max( dp[a - 1][b], dp[a][b - 1] );
                }
            }

        return dp[x][y];
    }
}