class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        
        // Use a StringBuilder to construct the result string
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < words.length; i++) {
            // Reverse each word using StringBuilder's reverse method
            StringBuilder reversedWord = new StringBuilder(words[i]).reverse();
            result.append(reversedWord);
            
            // Append a space if it's not the last word to preserve original spacing
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        
        return result.toString();

    }
}