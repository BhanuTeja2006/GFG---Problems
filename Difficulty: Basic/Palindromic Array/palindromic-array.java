/*Complete the Function below*/
class Solution {
    public static boolean isPalinArray(int[] arr) {
        for(int i=0;i<arr.length;i++){
            String s=Integer.toString(arr[i]);
            String rev=new StringBuilder(s).reverse().toString();
            if(!s.equals(rev)){
                return false;
            }
        }
        return true;
        
    }
}