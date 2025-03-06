class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()) return false;
        Map <Character, Character> map1 = new HashMap<>();
        Map <Character, Character> map2 = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            char st= s.charAt(i);
            char ts = t.charAt(i);
            if(map1.containsKey(st)){
                if(map1.get(st) != ts){
                    return false;
                }
            }
            if(map2.containsKey(ts)){
                if(map2.get(ts) != st){
                    return false;
                }
            }
            map1.put(st, ts);
            map2.put(ts,st);
        }
        return true;
    }
}