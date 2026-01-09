class Solution {
    public static int sumOfDigits(int n) {
        // Code here
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}
