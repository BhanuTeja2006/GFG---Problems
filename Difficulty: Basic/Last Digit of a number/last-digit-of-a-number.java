class Solution {
    public int lastDigit(int n) {
        // Code here
        int o = n%10;
        return Math.abs(o);
    }
}