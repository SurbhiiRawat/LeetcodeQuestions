class Solution {
    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        Map<Integer, Integer> map1 = new HashMap<>();
       
        int ans =0;

        for(int i=0; i<nums1.length; i++){
            for(int j = 0; j<nums2.length; j++){
                map1.put(nums1[i]+nums2[j], map1.getOrDefault(nums1[i] + nums2[j], 0) +1);
            }
        }
        for(int i=0; i<nums3.length; i++){
            for(int j = 0; j<nums4.length; j++){
                int sum = nums3[i]+ nums4[j];
                
                ans += map1.getOrDefault(-sum, 0);
            }
        }
        // for(int value : map1.keySet()){
        //     int val2 = -value;
        //     if(map2.containsKey(val2)){
        //         ans += map1.get(value) * map2.get(val2);
        //     }
        // }
        return ans;
    }
}