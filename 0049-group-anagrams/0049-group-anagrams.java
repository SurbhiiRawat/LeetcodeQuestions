class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap <String, List<String>> map = new HashMap<>();

        for(String str : strs){
            int freq[] = new int[26];
            for(char c: str.toCharArray()){    // convert string into character array
                freq[c - 'a']++;
            }
            String key = Arrays.toString(freq);
             
            if(map.containsKey(key)){
                List<String> list = map.get(key);
                list.add(str);
                map.put(key, list);
            }else{
                List<String> list = new ArrayList<>();
                list.add(str);        //if new el, add that in a list and add that list into map
                map.put(key, list);
            }
        }
        return new ArrayList<>(map.values());
    }
}