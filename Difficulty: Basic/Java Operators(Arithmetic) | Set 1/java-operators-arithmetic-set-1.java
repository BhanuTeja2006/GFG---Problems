
class Solution {
    public double[] FindRoots(int A, int B, int C) {
        // code here
        double a = (B*B-4*A*C);
        double b = Math.sqrt(a);
        double c1 = (-(1*B)+b)/(2*A);
        double c2 = ((-1*B)-b)/(2*A);
        if(a<0) return new double[]{-1};
        double[] root = new double[2];
        if(c1>c2){
            root[0] = c2;
            root[1] = c1;
        }else{
            root[0] = c1;
            root[1] = c2;
        }
        return root;
    }
}