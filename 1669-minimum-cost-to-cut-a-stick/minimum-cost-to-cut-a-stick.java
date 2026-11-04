class Solution {
    private static int solve(int i,int j,int[] arr,int[][] dp){
        if(i>j) return 0;

        if(dp[i][j]!=-1) return dp[i][j];
        int min=Integer.MAX_VALUE;
        for(int k=i;k<=j;k++){
          int cost=solve(i,k-1,arr,dp)+solve(k+1,j,arr,dp)+arr[j+1]-arr[i-1];
           min=Math.min(min,cost);
        }
         
          return dp[i][j]=min;
    }
    public int minCost(int n, int[] cuts) {
        int m=cuts.length;

        int[] arr=new int[m+2];
        Arrays.sort(cuts);
         arr[0]=0;
         arr[m+1]=n;

        for(int i=0;i<m;i++){
            arr[i+1]=cuts[i];
        }
        int[][] dp=new int[m+1][m+1];

        for (int i = 0; i <= m; i++) {
           for (int j = 0; j <= m; j++) {
               dp[i][j] = -1;
          }
       }
       return solve(1,m,arr,dp);
    }
}