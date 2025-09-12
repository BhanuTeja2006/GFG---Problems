class Solution {
    public static ArrayList<Integer> fillArrayList(int arr[]) {
        // Your code here
        ArrayList<Integer> List = new ArrayList<>();
        for(int num : arr){
            List.add(num);
        }
        return List;
    }
}