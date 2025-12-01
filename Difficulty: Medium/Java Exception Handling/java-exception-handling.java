// User function Template for Java

class Solution {
    public int findMin(int a, int b) {
        if(a!=0&&b!=0)
        return Math.min(Math.min(a+b,a-b),Math.min(a*b,a/b));
        return Math.min(Math.min(a+b,a-b),a*b);
    }
}