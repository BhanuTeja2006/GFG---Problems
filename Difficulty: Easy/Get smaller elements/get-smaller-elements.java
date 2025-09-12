class Solution {
    public static ArrayList<Integer> getSmaller(int arr[], int target) {
        // write your code here
        ArrayList<Integer> List = new ArrayList<>();
        for(int num : arr){
            if(num<target){
                List.add(num);
            }
        }
        return List;
    }
}