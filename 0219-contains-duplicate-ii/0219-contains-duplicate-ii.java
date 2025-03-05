class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<nums.length; i++){
        //     if(map.containsKey(nums[i])){
        //         if(Math.abs(map.get(nums[i]) - i) <= k){
        //             return true;
        //         }
        //     }
        //     map.put(nums[i], i);
        // }
        // return false;


// use hash set :

        Set <Integer> set = new HashSet<>();
        for(int i=0; i<nums.length; i++){
            if(set.contains(nums[i])){
                return true;
            }
            set.add(nums[i]);
            if(set.size() > k){
                set.remove(nums[i-k]);
            }
            
        }
        return false;

    }
}