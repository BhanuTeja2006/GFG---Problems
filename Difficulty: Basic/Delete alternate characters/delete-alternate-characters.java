// User function template for Java

class Solution {
    static String delAlternate(String S) {
        String res="";
        for(int i=0;i<S.length();i+=2){
            res+=S.charAt(i);
        }
        return res;
    }
}