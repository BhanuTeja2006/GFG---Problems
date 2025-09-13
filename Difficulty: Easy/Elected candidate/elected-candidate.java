// User function Template for Java

import java.util.*;

class Solution {
    public static String electionWinner(String arr[]) {
        LinkedHashMap<String,Integer> hm = new LinkedHashMap<>();
        for (String x : arr) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        String ans = "";
        for (Map.Entry<String,Integer> x : hm.entrySet()) {
            if (x.getValue() > max) {
                max = x.getValue();
                ans = x.getKey();
            }
        }
        return ans;
    }
}
