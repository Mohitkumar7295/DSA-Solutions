class Solution {
    public int rob(int[] nums) {
        if(nums ==null || nums.length==0) return 0;
        if(nums.length ==1) return nums[0];

        return Math.max(
           range(nums,0,nums.length-2),
           range(nums,1,nums.length-1)
        );
    }

    private int range(int[] nums,int s,int e){
        int prev1=0;
        int prev2=0;

        for(int i=s;i<=e;i++){
           int curr=Math.max(prev1,prev2+nums[i]);

           prev2=prev1;
           prev1=curr;
        }
        return prev1;
    }
}