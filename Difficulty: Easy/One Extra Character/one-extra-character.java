// User function Template for Java
class Solution {
    public static Character oneExtraCharacter(String s1, String s2) {
        // Your code here
        int xor = 0;
        for (char c : s1.toCharArray()) {
            xor ^= c;
        }
        for (char c : s2.toCharArray()) {
            xor ^= c;
        }
        return (char) xor;
    }
}