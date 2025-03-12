class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int ans[] = new int[gain.length + 1];
        ans[0] = 0;
        for(int i=1; i<ans.length; i++){
            ans[i] = ans[i-1] + gain[i-1];
            max=Math.max(max,ans[i]);
        }
        System.out.print(ans);
        return max;
    }
}