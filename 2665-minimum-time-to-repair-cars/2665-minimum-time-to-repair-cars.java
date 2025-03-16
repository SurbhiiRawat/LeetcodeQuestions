class Solution {
    public long repairCars(int[] ranks, int cars) {
        long ans = 0;
        long low=1;
        long min = Integer.MAX_VALUE;
        for(long i: ranks){
            min = Math.min(min,i);

        }
        long high =(long) min*cars*cars;
        while(low <= high){
            long mid = (low+high)/2;
            if(isPossible(ranks,mid,cars)){
                ans= mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
        
    }
    public boolean isPossible(int[] ranks, long mid, int cars){
        long count =0;
        for(long i: ranks){
            if(i!=0){
                count +=(long) Math.sqrt(mid/i);
            }
            
        }
        return count>=cars;
    }
    
}