class Solution {
    public List<String> commonChars(String[] words) {
        List <String> list = new ArrayList<>();

        // making the main map, which contains 1st words's freq

        Map<Character, Integer> map = new HashMap<>();
        for(int i=0; i<words[0].length(); i++){
            map.put(words[0].charAt(i), map.getOrDefault(words[0].charAt(i), 0)+1);
        }

        // now for every map, create new map to store freq of each word

        for(int i=1; i<words.length; i++){
            Map<Character, Integer> tempMap = new HashMap<>();
            for(int j=0; j<words[i].length(); j++){
                tempMap.put(words[i].charAt(j), tempMap.getOrDefault(words[i].charAt(j), 0)+1);
            }
            // now in the 1st map, take min freq of common words that appear in all 3

            for(char c : map.keySet()){
                if(tempMap.containsKey(c)){
                    map.put(c, Math.min(map.get(c), tempMap.get(c)) );
                }else{
                    map.put(c, 0);
                }
            }
        }
    
        // now we'll make the final list which has all the all the character
        // which are common in all 3 words, frequency no. of times

        for(char c : map.keySet()){
            for(int j=0; j<map.get(c); j++){
                list.add(String.valueOf(c));
            }
        }  

        return list;

    }
}