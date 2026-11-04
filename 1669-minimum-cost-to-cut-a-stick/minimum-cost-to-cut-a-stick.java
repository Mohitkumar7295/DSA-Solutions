class Solution {
    private static int solve(int i,int j,int[] arr,int[][] dp){
        if(i+1>=j) return 0;

        if(dp[i][j]!=-1) return dp[i][j];
        int min=Integer.MAX_VALUE;
        for(int k=i+1;k<j;k++){
          int cost=solve(i,k,arr,dp)+solve(k,j,arr,dp)+arr[j]-arr[i];
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
        int[][] dp=new int[m+2][m+2];

        for (int i = 0; i <= m+1; i++) {
           for (int j = 0; j <= m+1; j++) {
               dp[i][j] = -1;
          }
       }
       return solve(0,m+1,arr,dp);
    }
}