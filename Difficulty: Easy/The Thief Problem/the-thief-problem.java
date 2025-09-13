class Solution {
    public int getMaxVal(List<Integer> arr, int k) {
        // code here
        int total = 0;
        Collections.sort(arr);
        int n = arr.size();
        for(int i=n-k;i<n;i++){
            total+=arr.get(i);
        }
        return total;
    }
}