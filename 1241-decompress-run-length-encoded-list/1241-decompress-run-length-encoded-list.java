class Solution {
    public int[] decompressRLElist(int[] nums) {
        
        List <Integer> list = new ArrayList<>();
        int freq=0;
        int val=0;
        for(int i=0; i<nums.length; i+=2){
            freq=nums[i];
            val=nums[i+1];
            for(int j=0; j<freq; j++){
                list.add(val);
            }
        }
        int arr[]= new int[list.size()];
        for(int i=0; i<list.size(); i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}