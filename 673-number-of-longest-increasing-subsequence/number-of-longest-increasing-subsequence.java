class Solution {
    public int findNumberOfLIS(int[] nums) {
        int n=nums.length;
        if(n==0) return 0;
        int[] dp=new int[n];
        int[] count=new int[n];
        int maxLen=1;
        for(int i=0;i<n;i++){
            dp[i]=1;
            count[i]=1;
            for(int j=0;j<i;j++){
           if(nums[i]>nums[j]){

            if(dp[i]<dp[j]+1){
            dp[i]=1+dp[i];
            count[i]=count[j];
            }else if(dp[j]+1 == dp[i] ){
                count[i]+=count[j];
            }
           }
          
            }
             maxLen=Math.max(dp[i],maxLen);
        }

        int nooflis=0;

        for(int i=0;i<n;i++){
            if(dp[i]==maxLen){
                nooflis+=count[i];
            }
        }
        return nooflis;
    }
}