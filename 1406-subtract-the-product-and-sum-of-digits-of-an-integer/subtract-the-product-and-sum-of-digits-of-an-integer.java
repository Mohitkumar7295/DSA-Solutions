class Solution {
    public int subtractProductAndSum(int n) {
        int p=1;
        int sum=0;
        int m=n;
        while(m>0){
            int temp=m%10;
            m/=10;
            sum+=temp;
            p*=temp;
        }
        return p-sum;
    }
}