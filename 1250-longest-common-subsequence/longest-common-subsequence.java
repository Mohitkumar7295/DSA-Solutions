class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int m=text1.length();
        int n=text2.length();

        int[][] memo=new int[m+1][n+1];

        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                memo[i][j]=-1;
            }
        }
        return solve(text1,text2,m,n,memo);
    }
      public static int solve(String s1,String s2,int m,int n,int[][] memo){
        if(m==0 || n==0) return 0;

        if(memo[m][n] !=-1) return memo[m][n];

        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return 1+solve(s1,s2,m-1,n-1,memo);
        }else{
            return memo[m][n]=Math.max(solve(s1,s2,m-1,n,memo),solve(s1,s2,m,n-1,memo));
        }
    }
}