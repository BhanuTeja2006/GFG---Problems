// User function Template for Java
class Solution {
    public static int nFactorial(int n) {
        int ans = 1;
        int i = 1;

        // Write your code here
        while(i<=n){
            ans = ans*i;
            i++;
            
        }

        return ans;
    }
}