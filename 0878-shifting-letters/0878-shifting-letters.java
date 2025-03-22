class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int suffix[] = new int[shifts.length];
        suffix[shifts.length-1] = shifts[shifts.length-1];
        for(int i= shifts.length-2; i>= 0; i--){
            suffix[i] = (suffix[i+1] + shifts[i]) % 26;
        }
        StringBuilder result = new StringBuilder(s);
        for(int i=0; i<s.length(); i++){
            char c = (char)((s.charAt(i) - 'a' + suffix[i])%26 + 'a');
            result.setCharAt(i, c);
        }

        return result.toString();
    }
}