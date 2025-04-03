class Solution {
    public String removeKdigits(String num, int k) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> st = new Stack<>();
        for (char curr : num.toCharArray()){
            while(!st.isEmpty() && st.peek() > curr && k>0){
                st.pop();
                k--;
            }
            if(st.isEmpty() && curr=='0'){
                continue;
            }else{
                st.push(curr);
            }
        }
        while(k>0 && !st.isEmpty()){
            st.pop();
            k--;
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        sb.reverse();
        if(sb.length()==0) return "0";
        return sb.toString();
    }
}