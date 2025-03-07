class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        for(String s : arr){
            map.put(s, map.getOrDefault(s,0)+1);
        }
        int count=0;
        for(int i=0; i<arr.length; i++){
            int freq = map.get(arr[i]);
            if(freq==1) count++;
            if(count==k){
                return arr[i];
            }
        }
        return "";
    }
}