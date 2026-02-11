// User function Template for Java
class Solution {
    public static double avgUsingStreams(int[] arr) {
        return Arrays.stream(arr).average().getAsDouble();
    }
}