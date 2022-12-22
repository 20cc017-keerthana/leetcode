class Solution {
    public int lengthOfLastWord(String s) {
        String str=s.trim();
        String[] word=str.split(" ");
        String last_word=word[word.length-1];
        int len=last_word.length();
        return len;
        
    
    }
}
