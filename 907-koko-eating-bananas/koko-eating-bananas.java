class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1, high = 0;
        for(int n: piles){
            high = Math.max(high, n);
        }
        while(low<=high){
            int mid = low +(high -low)/2;
            long hours = 0;
            for(int n: piles){
                hours += (n + mid -1)/mid;
            }
            if(hours<=h){
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        return low;
    }
}