class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        ArrayList<Integer> list=new ArrayList<>();
        int[] freq=new int[n]; 
        for(int i=0;i<edges.size();i++){
            freq[edges.get(i).get(1)]++;
        }
        for(int i=0;i<n;i++){
            if(freq[i]==0){
                list.add(i);
            }
        }
        return list;
    }
}