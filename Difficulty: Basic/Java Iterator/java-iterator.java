

class Solution {
    static ArrayList<Integer> javaIterator(int n, int k, int[] arr) {
        // code here
        //CollectionName<DataType> variableName=new CollectionName<>();
        ArrayList<Integer> List = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>=k){
                List.add(arr[i]);
            }
            
        }
        Collections.sort(List);
        return List;
    }
}
