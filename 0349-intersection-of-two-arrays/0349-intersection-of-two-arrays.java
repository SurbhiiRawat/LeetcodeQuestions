class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0 ; i<nums1.length; i++){
            map.put(nums1[i], map.getOrDefault(nums1[i], 0) +1);
        }
        for(int i= 0; i<nums2.length; i++){
            if(map.containsKey(nums2[i])){
                set.add(nums2[i]);
            }
        }
        int[] result = new int[set.size()];
        int i = 0;
        for (int num : set) {
            result[i++] = num;
        }

        return result;
    }
}