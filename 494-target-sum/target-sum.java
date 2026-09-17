class Solution {
    public int findTargetSumWays(int[] nums, int target) {
       int n=nums.length;
       int totalSum=0;
       for(int i=0;i<n;i++){
        totalSum+=nums[i];
       }

       int sum=(totalSum+target)/2;
        if (Math.abs(target) > totalSum) {
            return 0;
        }
        if((totalSum+target) %2 !=0){
           return 0;
        }

       int[][] dp=new int[n+1][sum+1];

       for(int i=0;i<=n;i++){
        for(int j=0;j<=sum;j++){
            dp[i][j]=-1;
        }
       }
       return solve(nums,n,sum,dp);
    }
    private static int solve(int[] nums,int i,int sum,int[][] dp){
        if(i==0){
            if(sum==0){
                return 1;
            }
            return 0;
        }
        if(dp[i][sum]!=-1){
            return dp[i][sum];
        }
        int notTake=solve(nums,i-1,sum,dp);
        int take=0;
        if(nums[i-1]<=sum){
            take=solve(nums,i-1,sum-nums[i-1],dp);
        }
        dp[i][sum]=take+notTake;
        return dp[i][sum];
    }
}