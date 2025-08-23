//Back-end complete function Template for Java
import java.util.*;

public class Solution {
    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
         int count=0;
        for(int i=num; num>0; num--)
        {
            num=num%10;
            count++;
        }
       System.out.println(count);
    }
}