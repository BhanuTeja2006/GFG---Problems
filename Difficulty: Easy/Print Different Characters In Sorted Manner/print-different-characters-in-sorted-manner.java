class Solution {
    public static String Sorted_Characters(String s) {
        boolean[] seen = new boolean[26];
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            seen[c - 'a'] = true;
        }
        for (int i = 0; i < 26; i++) {
            if (seen[i]) {
                result.append((char)(i + 'a'));
            }
        }
        return result.toString();
    }
}
