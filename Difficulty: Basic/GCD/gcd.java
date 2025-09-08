// User function Template for Java
class Solution {
    public static int gcd(int a, int b) {
        int gcd=1;
        int min=Math.min(a,b);
        for(int i=min;i>1;i--){
            if(a%i==0 && b%i==0){
                gcd=i;
                break;
            }
        }
        return gcd;
        // code here to calculate and return gcd of a and b
    }
}