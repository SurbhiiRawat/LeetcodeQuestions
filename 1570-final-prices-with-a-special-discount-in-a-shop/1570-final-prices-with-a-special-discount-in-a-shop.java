class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[prices.length];
        for(int i=0; i<prices.length; i++){
            while(!st.isEmpty() && prices[i] <= prices[st.peek()]){
                ans[st.peek()] = prices[st.peek()] - prices[i];
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            ans[st.peek()]=prices[st.peek()];
            st.pop();
        }
        return ans;
    }
}