class Solution {
    public int maxEnvelopes(int[][] envelopes) {
      Arrays.sort(envelopes,(a,b)-> {
        if(a[0]==b[0]){
            return Integer.compare(b[1],a[1]);
        }
        return Integer.compare(a[0],b[0]);
      });

      ArrayList<Integer> lis=new ArrayList<>();
       for(int i=0;i<envelopes.length;i++ ){
        int h=envelopes[i][1];

        int idx=lowerBound(lis,h);

        if(idx==lis.size()){
            lis.add(h);
        }else{
            lis.set(idx,h);
        }
       }
      return lis.size();
    }
    public int lowerBound(ArrayList<Integer> lis,int target){
        int low=0,high=lis.size();

        while(low<high){
            int mid=low+(high-low)/2;

            if(lis.get(mid)>=target){
                high=mid;
            }else{
                low=mid+1;
            }
        }
        return low;
    }
}