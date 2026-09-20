class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for (int i = 0; i < s.length(); i++) {
            int reversedPosition = 26 - (s.charAt(i) - 'a');
            int stringIndex = i + 1;
            sum += reversedPosition * stringIndex;
        }
        return sum;
    }
}