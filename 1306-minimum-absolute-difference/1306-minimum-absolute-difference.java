class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(arr);

        int minDiff=Integer.MAX_VALUE;
        for(int i=1; i<arr.length; i++){
            if(arr[i]-arr[i-1] <= minDiff){
                minDiff  = arr[i]-arr[i-1];
            }
        }
        int i=1;
        while(i < arr.length){
            if(arr[i] - arr[i-1] == minDiff){
                ans.add(Arrays.asList(arr[i-1], arr[i]));
            }
            i++;
        }
        return ans;
    }
}