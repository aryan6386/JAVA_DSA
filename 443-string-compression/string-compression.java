class Solution {
    public int compress(char[] chars) {
        int start =0, write =0;
        for(int read =0; read<chars.length;read++){
            if(read==chars.length -1|| chars[read]!=chars[read + 1]){
                chars[write++] = chars[start];
                int count  = read -start +1;
                if(count>1){
                    for (char c : String.valueOf(count).toCharArray()) {
                        chars[write++] = c;
                    }
                }
                start = read +1;
            }
        }
        return write;
    }

}