// User function Template for Java
class Solution {
    String isVowel(char c) {
        String a = "YES";
        String b = "NO";
        switch(c){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                return a;
            default:
                return b;
            
        }
    }
}
