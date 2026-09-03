class Solution {
    public boolean uniformArray(int[] nums1) {
        int minVal = Integer.MAX_VALUE;
        boolean hasOdd = false;
        boolean hasEven = false;
        
        for (int num : nums1) {
            if (num < minVal) {
                minVal = num;
            }
            if (num % 2 == 0) {
                hasEven = true;
            } else {
                hasOdd = true;
            }
        }
       
        if (!hasOdd || !hasEven) {
            return true;
        }
        
        return minVal % 2 != 0;
    }
}