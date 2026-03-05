class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())return "" ; 
        int freq[] = new int[128];      
        for(char c :t.toCharArray()){
            freq[c]++;
        }
        int left=0, right=0 , req = t.length() ,minLength = Integer.MAX_VALUE, startIndex = 0;
            while(right<s.length()){
                if(freq[s.charAt(right)]>0){
                    req--;
                }
                freq[s.charAt(right)]--;
            right++;
            while (req== 0) {

                if (right - left < minLength) {
                    minLength = right - left;
                    startIndex = left;
                }

                freq[s.charAt(left)]++;

                if (freq[s.charAt(left)] > 0) {
                    req++;
                }

                left++;
            }
            }
            return minLength == Integer.MAX_VALUE
                ? ""
                : s.substring(startIndex, startIndex + minLength);
    }
}