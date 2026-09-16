class Solution {
    public int lastStoneWeightII(int[] stones) {
        int sum = 0;
        for (int stone : stones) {
            sum += stone;
        }
        
        int target = sum / 2;
        boolean[] dp = new boolean[target + 1];
        dp[0] = true;
        
        int maxSubsetSum = 0;
        
        for (int stone : stones) {
            for (int j = target; j >= stone; j--) {
                if (dp[j - stone]) {
                    dp[j] = true;
                    maxSubsetSum = Math.max(maxSubsetSum, j);
                }
            }
        }
        
        return sum - 2 * maxSubsetSum;
    
    }
}