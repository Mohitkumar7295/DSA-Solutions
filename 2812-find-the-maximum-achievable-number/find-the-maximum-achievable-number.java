class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int n=num;
        while(t>0){
            n+=2;
            t--;
        }
        return n;
    }
}