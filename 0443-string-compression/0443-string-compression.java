class Solution {
    public int compress(char[] chars) {
        int index =0;
        int i=0;
        while(i<chars.length){
            char currChar = chars[i];
            int count=0;
            while(i<chars.length && chars[i]==currChar){
                count++;
                i++;
            }
            chars[index] = currChar;
            index++;
            if(count >1){
                for(char c : Integer.toString(count).toCharArray()){
                    chars[index]=c;
                    index++;
                }
            }
        }
        return index;
    }
}