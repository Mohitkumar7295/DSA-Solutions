class Solution {
    public int numOfWays(int n) {
        long mod = 1_000_000_007;
        long color2 = 6; 
        long color3 = 6; 
        
        for (int i = 2; i <= n; i++) {
            long nextColor2 = (3 * color2 + 2 * color3) % mod;
            long nextColor3 = (2 * color2 + 2 * color3) % mod;
            
            color2 = nextColor2;
            color3 = nextColor3;
        }
        
        return (int) ((color2 + color3) % mod);
    }
}