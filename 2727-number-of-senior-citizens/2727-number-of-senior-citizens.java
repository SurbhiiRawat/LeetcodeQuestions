class Solution {
    public int countSeniors(String[] details) {
        int count =0;
        for(int i=0; i<details.length; i++){
            String s = details[i];
            int age = Integer.parseInt(s.substring(11,13));
            if(age > 60){
                count += 1;
            }else{
                count += 0;
            }
        }
        return count;
    }
}