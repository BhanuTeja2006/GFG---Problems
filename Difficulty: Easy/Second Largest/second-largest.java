class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int l = arr[0];
        int sl = -1;
        int i=0;
        while(i<arr.length){
            if(arr[i]>l){
                l=arr[i];
            }
            i++;
        }
        i=0;
        while(i<arr.length){
            if(arr[i]>sl && l>arr[i]){
                sl=arr[i];
            }
            i++;
        }
        return sl;
    }
}