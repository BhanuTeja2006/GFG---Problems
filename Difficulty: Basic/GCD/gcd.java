class Solution {
    public int computeGCD(int a, int b) {
        if(b==0){
            return a;
        }
        return computeGCD(b,a%b);
        
        
    }
}
