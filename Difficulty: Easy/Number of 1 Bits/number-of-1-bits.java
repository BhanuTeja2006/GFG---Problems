// User function Template for Java
class Solution {
    static int setBits(int n) {
        // code here
        int c = 0;
        String co = Integer.toString(n,2);
        for(char ch: co.toCharArray()){
            if(ch == '1'){
                c++;
            }
        }
        return c;
        
    }
}