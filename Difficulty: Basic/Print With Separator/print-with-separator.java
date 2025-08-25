public class Solution {
    public static void utility(Scanner scn) {
        String a = scn.nextLine();
        String b = scn.nextLine();
        String separator = scn.nextLine();
        StringBuilder rev=new StringBuilder();
        rev.append(a+separator+b);
        System.out.println(rev);
        // print with seperator
    }
}
