class Solution {
    public int binarysearch(int[] arr, int k) {
        int n = arr.length;
        int st = 0, end = n - 1;
        int result = -1;
        while (st <= end) {
            int mid = (st + end) / 2;
            if (k == arr[mid]) {
                result = mid; 
                end = mid - 1; 
            } else if (k < arr[mid]) {
                end = mid - 1;
            } else {
                st = mid + 1;
            }
        }
     return result;
    }
}