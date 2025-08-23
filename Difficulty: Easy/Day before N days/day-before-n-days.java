// User function Template for Java
class Solution {
    public static int nthDay(int d, int n) {
        // write your code here
        int e = n%7;
        int r = (d-e+7)%7;
        return r;
    }
}