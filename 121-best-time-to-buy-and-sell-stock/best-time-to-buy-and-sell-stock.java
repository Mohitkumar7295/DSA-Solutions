class Solution {
    private static int solve(int i,int buy,int[] arr,int[][] dp){
          if (i == arr.length) return 0;

        if (dp[i][buy] != -1) return dp[i][buy];

        int profit;

        if (buy == 1) {
            
            profit = Math.max(
                -arr[i] + solve(i + 1, 0, arr, dp),
                solve(i + 1, 1, arr, dp)
            );
        } 
        else {
            
           profit = Math.max(
        arr[i] + 0, 
        solve(i + 1, 0, arr, dp)
    );
        }

        return dp[i][buy] = profit;
    }
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] dp = new int[n][2];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

      return solve(0, 1, prices, dp);
    }
}