// User function Template for Java

class Solution {
    public static int findSum(int A[], int N) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<N;i++){
            min=Math.min(min,A[i]);
            max=Math.max(max,A[i]);
        }
        return min+max;
    }
}
