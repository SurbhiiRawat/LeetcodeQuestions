class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;
        int arr1[] = new int[26];
        Set<Character> set1 = new HashSet<>();
        Set<Character> set2 = new HashSet<>();
        for(int i=0; i<word1.length(); i++){
            arr1[word1.charAt(i) - 'a']++;
            set1.add(word1.charAt(i));
        }
        int arr2[] = new int[26];
        for(int i=0; i<word2.length(); i++){
            arr2[word2.charAt(i) - 'a']++;
            set2.add(word2.charAt(i));
        }
        if(!set1.equals(set2)) return false;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0; i<arr1.length; i++){
            if(arr1[i] != arr2[i]) return false;
        }
        return true;
    }
}