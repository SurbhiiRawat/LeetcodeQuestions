class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        // int prefix[] = new int[nums.length];
        // prefix[0]=nums[0];
        // for(int i=1; i<nums.length ; i++){
        //     prefix[i] = prefix[i-1] + nums[i];
        // }
        int sum =0;
        int ans =0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            int rem = sum%k;
            if(rem <0){
                rem += k;
            }
            if(map.containsKey(rem) ){
                ans += map.get(rem);
            }
            map.put(rem, map.getOrDefault(rem, 0)+1);
        }
        return ans;
    }
}