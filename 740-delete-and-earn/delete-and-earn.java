class Solution {
    public int deleteAndEarn(int[] nums) {
        int[] point=new int[10001];

        for(int num :nums){
            point[num]+=num;
        }

        int prev1=0;
        int prev2=0;

        for(int i=0;i<10001;i++){
            int curr=Math.max(prev1,prev2+point[i]);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}