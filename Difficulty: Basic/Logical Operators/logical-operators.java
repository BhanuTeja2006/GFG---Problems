class Solution {
    public String booleanOperations(boolean a, boolean b) {
        // Code here
        boolean andresult = a&&b;
        boolean orresult = a||b;
        boolean notresult = !a;
        
        return andresult+ " " + orresult+ " " + notresult;
        
    }
}