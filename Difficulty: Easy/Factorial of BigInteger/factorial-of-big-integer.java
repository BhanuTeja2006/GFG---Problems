class Solution {
    public static java.math.BigInteger factorial(int n) {
        java.math.BigInteger sum = java.math.BigInteger.ONE;
        for (int i = n; i > 0; i--) {
            sum = sum.multiply(java.math.BigInteger.valueOf(i));
        }
        return sum;
    }
}
