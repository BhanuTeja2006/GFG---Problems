import java.util.Scanner;

public class Solution {
    public static void solve() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // take input 
        int p=a,q=b;
        while(b!=0){
            int temp =b;
            b=a%b;
            a=temp;
        }
        System.out.print((p*q)/a);
    }
}

