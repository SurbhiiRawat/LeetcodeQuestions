class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int cost =0;
        int i =0;
        int j=0;
        int len =0;
        int ans = 0;
        while(i <s.length()){
            cost += Math.abs(s.charAt(i)-t.charAt(i));
            if(cost <= maxCost){
                len = Math.max(len, i-j+1);
            }
            
            if(cost > maxCost){
                cost -= Math.abs(s.charAt(j)-t.charAt(j));
                j++;
            }
            i++;
            ans = Math.max(ans, len);
        }
        return ans;
    }
}