class Solution {
    Integer[][][] memo;

    public int findMaxForm(String[] strs, int m, int n) {
        memo = new Integer[strs.length][m + 1][n + 1];
        return dp(strs, 0, m, n);
    }

    private int dp(String[] strs, int i, int m, int n) {
        if (i == strs.length) {
            return 0;
        }
        
        if (memo[i][m][n] != null) {
            return memo[i][m][n];
        }

        int zeros = 0;
        int ones = 0;
        for (char c : strs[i].toCharArray()) {
            if (c == '0') zeros++;
            else ones++;
        }

        int skip = dp(strs, i + 1, m, n);
        int take = 0;
        
        if (m >= zeros && n >= ones) {
            take = 1 + dp(strs, i + 1, m - zeros, n - ones);
        }

        return memo[i][m][n] = Math.max(skip, take);
    }
}