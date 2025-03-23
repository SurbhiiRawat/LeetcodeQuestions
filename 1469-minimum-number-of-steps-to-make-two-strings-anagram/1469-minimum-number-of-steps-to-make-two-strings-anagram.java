class Solution {
    public int minSteps(String s, String t) {
        int count=0;
        Map <Character, Integer> map1 = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) +1);
        }
        // Map <Character, Integer> map2 = new HashMap<>();
        // for(int i=0; i<t.length(); i++){
        //     map2.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) +1);
        // }
        for(int i=0; i<t.length(); i++){
            if(map1.containsKey(t.charAt(i))  && map1.get(t.charAt(i)) > 0){
                map1.put(t.charAt(i), map1.get(t.charAt(i))-1);
            }else{
                count++;
            }
        }
        return count;
    }
}