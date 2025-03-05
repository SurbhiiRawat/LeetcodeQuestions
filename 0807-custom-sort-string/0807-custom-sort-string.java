class Solution {
    public String customSortString(String order, String s) {
        int[] freq = new int[26];

        // Count frequency of each character in s
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();

        // Append characters in the order given by "order"
        for (char c : order.toCharArray()) {
            while (freq[c - 'a'] > 0) {
                sb.append(c);
                freq[c - 'a']--;
            }
        }

        // Append remaining characters in their original order
        for (char c = 'a'; c <= 'z'; c++) {
            while (freq[c - 'a'] > 0) {
                sb.append(c);
                freq[c - 'a']--;
            }
        }

        return sb.toString();
    }
}
