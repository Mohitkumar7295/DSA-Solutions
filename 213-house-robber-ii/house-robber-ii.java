class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];
        
        
        Integer[] memo1 = new Integer[n];
        Integer[] memo2 = new Integer[n];
        
        
        int case1 = solve(nums, n - 2, 0, memo1);
        
        int case2 = solve(nums, n - 1, 1, memo2);
        
        return Math.max(case1, case2);
    }
    
    private int solve(int[] nums, int curr, int startLimit, Integer[] memo) {
       
        if (curr < startLimit) {
            return 0;
        }
        
       
        if (memo[curr] != null) {
            return memo[curr];
        }
        
        
        int robCurrent = nums[curr] + solve(nums, curr - 2, startLimit, memo);
        
       
        int skipCurrent = solve(nums, curr - 1, startLimit, memo);
        
        
        return memo[curr] = Math.max(robCurrent, skipCurrent);
    }
}