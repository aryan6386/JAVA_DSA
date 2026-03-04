class Solution {
    public String reverseWords(String s) {
        String []arr = s.trim().split("\\s+");
        List<String> str = Arrays.asList(arr);
        Collections.reverse(str);
        return String.join(" ",str);
    }
}