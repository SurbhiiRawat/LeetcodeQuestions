class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        HashMap<Character, String> mp = new HashMap<>();
        mp.put('a', ".-");
        mp.put('b', "-...");
        mp.put('c', "-.-.");
        mp.put('d', "-..");
        mp.put('e', ".");
        mp.put('f', "..-.");
        mp.put('g', "--.");
        mp.put('h', "....");
        mp.put('i', "..");
        mp.put('j', ".---");
        mp.put('k', "-.-");
        mp.put('l', ".-..");
        mp.put('m', "--");
        mp.put('n', "-.");
        mp.put('o', "---");
        mp.put('p', ".--.");
        mp.put('q', "--.-");
        mp.put('r', ".-.");
        mp.put('s', "...");
        mp.put('t', "-");
        mp.put('u', "..-");
        mp.put('v', "...-");
        mp.put('w', ".--");
        mp.put('x', "-..-");
        mp.put('y', "-.--");
        mp.put('z', "--..");

        Set<String> set = new HashSet<>();
        for(int i=0; i<words.length; i++){
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<words[i].length(); j++){
                sb.append(mp.get(words[i].charAt(j)));  
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}