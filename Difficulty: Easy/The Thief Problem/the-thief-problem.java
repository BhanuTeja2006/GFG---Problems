// User function Template for Java

class Solution {
    public static int getMaxVal(int arr[], int k) {
        // Your code here
        Integer[] temp = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }
        Arrays.sort(temp, Collections.reverseOrder());
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += temp[i];
        }
        return sum;
    }
}