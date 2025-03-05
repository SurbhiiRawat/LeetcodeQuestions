class Solution {
    public int numRabbits(int[] answers) {
        Map <Integer, Integer> map = new HashMap<>();
        int res = 0;
        for(int i=0; i<answers.length; i++){
            if(map.containsKey(answers[i])){
                if(map.get(answers[i]) == 0){
                    res += answers[i]+1;
                    map.put(answers[i], answers[i]);
                }else{
                    int freq = map.get(answers[i]);
                    map.put(answers[i], freq-1);
                }
            }else{
                res += answers[i]+1;
                map.put(answers[i], answers[i]);
            }
        }
        return res;
    }
}