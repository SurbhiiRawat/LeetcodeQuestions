class Solution {
    public int numberOfAlternatingGroups(int[] colors) {
        int n = colors.length;
        int arr[] = new int[n*2];
        for(int i=0; i< 2*colors.length; i++){
            arr[i] = colors[i % n];
        }
        int i=0;
        int j=2;
        int count = 0;
        while(j<arr.length && i<colors.length){
            if(arr[i] != arr[i+1] && arr[j-1] != arr[j]){
               count++;
            }
            i++;
            j++;
        }
        return count;
    }
}