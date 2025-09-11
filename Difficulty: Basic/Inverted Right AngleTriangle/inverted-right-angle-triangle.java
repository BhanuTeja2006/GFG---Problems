class Solution {
    public void printPattern(int n) {
        // Code here
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i+j>=n) break;
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}