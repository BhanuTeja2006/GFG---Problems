class Solution {
    public static int unique_substring(String s) {   // renamed
        int n = s.length();
        int[] sa = buildSuffixArray(s);
        int[] lcp = buildLCP(s, sa);

        int total = n * (n + 1) / 2;
        int repeated = 0;
        for (int x : lcp) repeated += x;

        return total - repeated;
    }

    private static int[] buildSuffixArray(String s) {
        int n = s.length();
        Integer[] order = new Integer[n];
        for (int i = 0; i < n; i++) order[i] = i;

        java.util.Arrays.sort(order, (a, b) -> s.substring(a).compareTo(s.substring(b)));

        int[] sa = new int[n];
        for (int i = 0; i < n; i++) sa[i] = order[i];
        return sa;
    }

    private static int[] buildLCP(String s, int[] sa) {
        int n = s.length();
        int[] rank = new int[n];
        for (int i = 0; i < n; i++) rank[sa[i]] = i;

        int[] lcp = new int[n - 1];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (rank[i] == n - 1) { k = 0; continue; }
            int j = sa[rank[i] + 1];
            while (i + k < n && j + k < n && s.charAt(i + k) == s.charAt(j + k)) k++;
            lcp[rank[i]] = k;
            if (k > 0) k--;
        }
        return lcp;
    }
}
