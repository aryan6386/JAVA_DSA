class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low = 0, high = 0;
        for(int n : weights){
            low =Math.max(low,n);
            high += n;
        }
        while(low<high){
            int mid = low +(high - low)/2;
            if(can(weights,days,mid)){
                high = mid ;
            }else{low = mid +1;}
        }
        return low;
    }
    private boolean can(int[] weights , int days ,int cap){
        int day = 1;
        int load = 0;
        for(int n : weights){
            if(load+n>cap){
                day++;
                load=0;
            }
            load +=n;
        }
        return day<=days;
    }
}