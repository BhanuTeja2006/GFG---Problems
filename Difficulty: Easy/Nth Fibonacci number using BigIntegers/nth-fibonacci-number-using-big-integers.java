import java.math.BigInteger;

class Solution {
    public static BigInteger fib(int n) {
        // code here
        BigInteger A = new BigInteger("0");
        BigInteger B = new BigInteger("1");
        BigInteger C = new BigInteger("1");
        for(int i=1;i<=n;i++){
            C = A.add(B);
            A = B;
            B = C;
        }
        return A;
    }
}