class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int ans[] = new int[arr1.length];
        Map <Integer, Integer> map= new HashMap<>();
        for(int i=0; i<arr1.length; i++){
            map.put(arr1[i], map.getOrDefault(arr1[i], 0)+1);
        }
        int k=0;
        for(int i=0; i<arr2.length; i++){
            if(map.containsKey(arr2[i])){
                for(int j=0; j<map.get(arr2[i]); j++){
                    ans[k]=arr2[i];
                    k++;
                }
                map.remove(arr2[i]);
            }
        }
        Arrays.sort(arr1);
        for(int i=0; i<arr1.length; i++){
            if(map.containsKey(arr1[i])){
                ans[k] = arr1[i];
                k++;
            }
        }
        return ans;
    }
}