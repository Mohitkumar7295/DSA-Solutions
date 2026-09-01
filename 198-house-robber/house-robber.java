class Solution {
    Integer[] memo;

    public int rob(int[] nums) {
        memo = new Integer[nums.length];
        return robFrom(nums, 0);
    }

    private int robFrom(int[] nums, int currentIndex) {
        if (currentIndex >= nums.length) {
            return 0;
        }
        
        if (memo[currentIndex] != null) {
            return memo[currentIndex];
        }

        int robCurrent = nums[currentIndex] + robFrom(nums, currentIndex + 2);
        int skipCurrent = robFrom(nums, currentIndex + 1);

        memo[currentIndex] = Math.max(robCurrent, skipCurrent);
        
        return memo[currentIndex];
    }
}