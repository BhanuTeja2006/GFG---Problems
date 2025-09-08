// User function Template for Java
class Solution {
    public static char extraChar(String s1, String s2) {
        for(int i=0;i<s2.length();i++){
            boolean flag=false;
            for(int j=0;j<s1.length();j++){
                if(s2.charAt(i)==s1.charAt(j)){
                    flag=true;
                    break;
                }
            }
            if(!flag){
                return s2.charAt(i);
            }
        }
        return s2.charAt(s2.length()-1);
    }
}
