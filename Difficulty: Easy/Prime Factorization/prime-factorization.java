class Solution {
    public static void printPrimeFactorization(int n) {
        int a =2;
        while(a<=n){
            if(n%a==0){
                System.out.print(a+" ");
                n /= a;
            }
            else{
                a++;
            }
        }
    }
}
