class Solution {
    public static void triangle(int s) {
        for (int i = 0; i < s; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == s - 1 || i == j) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}