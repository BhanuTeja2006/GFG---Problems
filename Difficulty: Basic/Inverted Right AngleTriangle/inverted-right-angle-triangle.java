// User function Template for Java
class Solution {
    public static void invTriangleWall(int s) {

        // Write your code here
        for(int i=0;i<s;i++){
            for(int j=s-i;j>=1;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}