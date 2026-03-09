class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int low =Integer.MAX_VALUE, high=0;
        if((long)m*k>bloomDay.length) return -1;
        for(int n : bloomDay){
            low = Math.min(low,n);
            high = Math.max(high,n);
        }
        while(low<high){
            int mid = low +(high -low)/2;
                if(pos(bloomDay,mid,m,k)){
                    high =mid; 
                }else{
                    low = mid+1;
                }
        }
        return low;
    }
    private boolean pos(int[] bloomDay, int day , int m , int k){
        int count =0, b = 0;
        for(int i =0; i<bloomDay.length ; i++){
            if(bloomDay[i]<=day){
                count++;
            }else{
                b += count/k;
                count =0;
            }
        }
        b += count/k;
                return b >= m;

    }
}