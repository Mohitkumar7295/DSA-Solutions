class Solution {
    public int countKeyChanges(String s) {
        String str=s.toLowerCase();
        int count=0;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i-1)!=str.charAt(i)){
                count++;
            }
        }
        return count;
    }
}