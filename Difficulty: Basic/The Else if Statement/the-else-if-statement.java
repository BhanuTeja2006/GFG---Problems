import java.util.*;

public class Solution {
    public static void solve() {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a>100){
            System.out.print("Big");
        }
        else if(a<10){
            System.out.print("Small");
        }
        else{
            System.out.print("Number");
        }
    }
}