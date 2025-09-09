// User function template for Java
class Solution {
    static int areAnagram(String S1, String S2) {
        if(S1.length()!=S2.length()) return 0;
        Map<Character,Integer>map=new HashMap<>();
        Map<Character,Integer>map1=new HashMap<>();
        for(char c:S1.toCharArray())
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
         for(char c:S2.toCharArray())
        {
            map1.put(c,map1.getOrDefault(c,0)+1);
        }
        return map.equals(map1)?1:0;
        // code here
        
    }
}