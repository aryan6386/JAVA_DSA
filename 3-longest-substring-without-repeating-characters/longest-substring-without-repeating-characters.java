class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        // Map to store the last seen index of each character
        Map<Character, Integer> map = new HashMap<>();
        int left = 0; // Left pointer of the sliding window

        for (int right = 0; right < n; right++) {
            char currentChar = s.charAt(right);
            // If the character is already in the map, move the left pointer 
            // to the position after the last occurrence of the duplicate.
            // Use Math.max to ensure 'left' never moves backward.
            if (map.containsKey(currentChar)) {
                left = Math.max(left, map.get(currentChar) + 1);
            }
            
            // Update the character's last seen position in the map.
            map.put(currentChar, right);
            
            // Update the maximum length found so far.
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}