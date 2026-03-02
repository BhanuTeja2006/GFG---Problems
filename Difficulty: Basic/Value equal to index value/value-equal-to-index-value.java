class Solution {
    public static ArrayList<Integer> valueEqualToIndex(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i] == i+1){
                res.add(i+1);
            }
        }
        return res;
        
    }
}
