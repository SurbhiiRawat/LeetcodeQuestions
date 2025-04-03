class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(!st.isEmpty() && c == ')' && s.charAt(st.peek()) == '('){
                st.pop();
            }else if(c=='(' || c==')'){
                st.push(i);
            }
        }
        while(!st.isEmpty()){
            int index = st.pop();
            if (index >= 0 && index < sb.length()) {
                sb.delete(index, index + 1);
            }
        }
        return sb.toString();
    }
}