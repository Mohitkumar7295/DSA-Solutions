class Solution {
    public String reversePrefix(String word, char ch) {
        int firstOccurrence=word.indexOf(ch);
        if(firstOccurrence == -1){
            return word;
        }

        char[] chars=word.toCharArray();
        int left=0;
        int right=firstOccurrence;

        while(left < right){
            char temp=chars[left];
            chars[left]=chars[right];
            chars[right]=temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}