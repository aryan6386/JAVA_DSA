class Solution {
    public int countSubstrings(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            count += expandFromCenter(s, i, i);

            // Even length palindrome
            count += expandFromCenter(s, i, i + 1);
        }

        return count;
    }

    private int expandFromCenter(String s, int left, int right) {

        int count = 0;

        while (left >= 0 && right < s.length() &&
               s.charAt(left) == s.charAt(right)) {

            count++;      // found a palindrome
            left--;
            right++;
        }

        return count;
    }
}