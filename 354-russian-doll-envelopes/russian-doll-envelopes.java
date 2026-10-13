class Solution {
    public int maxEnvelopes(int[][] envelopes) {
        Arrays.sort(envelopes, (a, b) -> {
            if (a[0] == b[0]) {
                return Integer.compare(b[1], a[1]); 
            }
            return Integer.compare(a[0], b[0]); 
        });
        int n=envelopes.length;
         int count=0;
       int[] lis=new int[n];

        for(int i=0;i<n;i++){
           int height=envelopes[i][1];

           int left=0,right=count;

           while(left < right){
            int mid=left+(right-left)/2;

            if(lis[mid]<height){
                left=mid+1;
            }else{
                right=mid;
            }
           }
           lis[left]=height;
           if(left==count){
            count++;
           }
        }

        return count;
    }
}