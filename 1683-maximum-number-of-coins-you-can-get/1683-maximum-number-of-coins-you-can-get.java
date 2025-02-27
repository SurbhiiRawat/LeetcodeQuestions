class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int i=0;
        int j=piles.length-1;
        int ans =0;
        while(i<j){
            if(piles[j-1]>=piles[i]){
                ans += piles[j-1];
            }
            i++;
            j -= 2;
        }
        return ans;
    }
}