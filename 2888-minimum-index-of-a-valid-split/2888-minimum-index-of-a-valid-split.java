class Solution {
    public int minimumIndex(List<Integer> nums) {
        Map <Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.size(); i++){
            map.put(nums.get(i), map.getOrDefault(nums.get(i), 0) +1);
        }
        int freq = 0;
        int dom = 0;
        for(int i=0; i<nums.size(); i++){
            freq = Math.max(freq, map.get(nums.get(i)));
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == freq) {
                dom = entry.getKey();
                break;
            }
        }
        int leftFreq = 0;
        int rightFreq = 0;
        for(int i=0; i<nums.size(); i++){
            if(nums.get(i) == dom){
                leftFreq++;
                rightFreq = freq - leftFreq;
            }
            if(leftFreq * 2 > i+1 && rightFreq * 2 > nums.size()-i-1){
                return i;
            }
        }
        return -1;
    }
}