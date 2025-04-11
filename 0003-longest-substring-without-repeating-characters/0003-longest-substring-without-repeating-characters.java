class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start =0;
        int end =0;
        int length =0;
        int ans =0;
        int arr[] = new int[128];
       // if(s.length()==0) return 
        while(end < s.length()){
            arr[s.charAt(end)]++;
            while(arr[s.charAt(end)] > 1){
                arr[s.charAt(start)]--;
                start++;
            }
            length = end-start+1;
            ans = Math.max(ans, length);
            end++;
        }
        return ans;
    }
}