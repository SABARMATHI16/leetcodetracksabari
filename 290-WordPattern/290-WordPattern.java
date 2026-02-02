// Last updated: 2/2/2026, 2:29:23 PM
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        if (pattern.length() != words.length) return false;
        String[] charToWord = new String[26]; 
        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            int idx = c - 'a';
            String word = words[i];
            if (charToWord[idx] == null) {
                charToWord[idx] = word;
            } else if (!charToWord[idx].equals(word)) {
                return false;
            }
            for (int j = 0; j < i; j++) {
                if (words[j].equals(word) && pattern.charAt(j) != c) {
                    return false;
                }
            }
        }
        return true;
    }
}