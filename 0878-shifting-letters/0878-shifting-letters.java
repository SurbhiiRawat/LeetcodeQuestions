class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=shifts.length-2; i>=0; i--){
            shifts[i] += shifts[i+1] % 26;
        }
        for(int i=0; i<s.length(); i++){
            char c = (char)('a' + (s.charAt(i)-'a' + shifts[i])%26);
            sb.append(c);
        }
        return sb.toString();
    }
}