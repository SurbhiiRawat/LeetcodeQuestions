class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap <Integer, Integer> mpp = new HashMap<>();
        ArrayList <Integer> ans = new ArrayList<>();

        for(int i=0; i<nums1.length; i++){
            mpp.put(nums1[i], mpp.getOrDefault(nums1[i], 0)+1);
        }

        for(int i=0; i<nums2.length; i++){
            if(mpp.containsKey(nums2[i])){
                int freq = mpp.get(nums2[i]);
                if(freq != 0){
                   ans.add(nums2[i]);
                   mpp.put(nums2[i], freq-1);
                }else{
                    mpp.remove(nums2[i]);
                }
            }
        }
        int result[] = new int[ans.size()];
        for(int i=0; i<ans.size(); i++){
            result[i]=ans.get(i);
        }
        return result;
    }
}