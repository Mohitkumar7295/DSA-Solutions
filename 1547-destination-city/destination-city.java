class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, Integer> outDegree = new HashMap<>();
        
        
        for (List<String> path : paths) {
            outDegree.putIfAbsent(path.get(0), 0);
            outDegree.putIfAbsent(path.get(1), 0);
            
           
            outDegree.put(path.get(0), outDegree.get(path.get(0)) + 1);
        }
        
        
        for (Map.Entry<String, Integer> entry : outDegree.entrySet()) {
            if (entry.getValue() == 0) {
                return entry.getKey();
            }
        }
        
        return "";
    }
}