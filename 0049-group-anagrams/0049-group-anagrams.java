class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        for(String str : strs){
            int freq[] = new int[26];
            for(int i=0; i<str.length(); i++){
                freq[str.charAt(i) - 'a']++;
            }

            String key = Arrays.toString(freq);

            if(!map.containsKey(key)){
                List<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
            }else{
                List<String> list = map.get(key);
                list.add(str);
                map.put(key, list);
            }
        }
        return new ArrayList<>(map.values());
    }
}