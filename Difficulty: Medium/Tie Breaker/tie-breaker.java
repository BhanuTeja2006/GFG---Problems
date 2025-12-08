// User function Template for Java

class Solution {
    public static String TieBreak(String[] arr) {
    Map<String, Integer> freq = new HashMap<>();

    for (String s : arr) {
        freq.put(s, freq.getOrDefault(s, 0) + 1);
    }

    String best = null;
    int bestCount = 0;

    for (Map.Entry<String, Integer> e : freq.entrySet()) {
        String word = e.getKey();
        int count = e.getValue();

        if (count > bestCount) {
            bestCount = count;
            best = word;
        } else if (count == bestCount && word.compareTo(best) < 0) {
            best = word;
        }
    }

    return best;
}
}