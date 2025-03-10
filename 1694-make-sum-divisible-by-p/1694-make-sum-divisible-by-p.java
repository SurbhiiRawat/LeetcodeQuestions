class Solution {
    public int minSubarray(int[] nums, int p) {
        int minLen = nums.length;
        long sum = 0;
        long need =0;
        for(int i=0; i<nums.length; i++){
            need += nums[i]%p;
        }
        need %= p;
        if(need==0) return 0;
        Map<Long, Integer> map = new HashMap<>();
        map.put(0L,-1);
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            sum %= p;
            long want = (sum - need + p)%p;
            if(map.containsKey(want)){
                minLen = Math.min(minLen, i-map.get(want));
            }
            map.put(sum, i);
        }
        return minLen==nums.length?-1:minLen;
    }
}