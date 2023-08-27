class Solution {
    public int longestPalindromeSubseq(String s) {
        char[] ch = new char[s.length()];
        for(int i = 0; i < s.length(); i++)
            ch[i] = s.charAt(s.length() - i - 1);

        int[][] dp = new int[s.length() + 1][ch.length + 1];

        for(int i = 0; i < s.length() + 1; i++)
            for(int j = 0; j < ch.length + 1; j++){
                if(i == 0 || j == 0) dp[i][j] = 0;
                else if(s.charAt(i - 1) == ch[j - 1]) dp[i][j] = 1 + dp[i - 1][j - 1];
                else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
            
        return dp[s.length()][ch.length];
    }
}