class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int i=1;
        int j=1;
        while(i < arr.length && j<arr.length-1){
            if(arr[i]-arr[i-1] != arr[j+1]-arr[j]){
                return false;
            }
            i++;
            j++;
        }
        return true;
        
    }
}