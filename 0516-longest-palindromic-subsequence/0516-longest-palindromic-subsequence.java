class Solution {
    public int helper(char[] s1, char[] s2, int a, int b, int[][] dp){
        if( a == 0 || b == 0 ) return 0;

        if(dp[a][b] != -1) return dp[a][b];

        if( s1[a - 1] == s2[b - 1])
            return dp[a][b] = 1 + helper(s1, s2, a - 1, b - 1, dp);
        return dp[a][b] = Math.max(helper(s1, s2, a, b - 1, dp), helper(s1, s2, a - 1, b, dp));
    }
    public int longestPalindromeSubseq(String s) {
        char[] ch = new char[s.length()];
        for(int i = 0; i < s.length(); i++)
            ch[i] = s.charAt(s.length() - i - 1);

        int[][] dp = new int[s.length() + 1][ch.length + 1];

        for(int i = 0; i < s.length() + 1; i++)
            for(int j = 0; j < ch.length + 1; j++)
                dp[i][j] = -1;

        return helper(s.toCharArray(), ch, s.length(), ch.length, dp);
    }
}