
class Solution {
    public boolean isSubset(int a[], int b[]) {
        // Your code here
        for(int ele : b){
            boolean found = false;
            for(int i=0;i<a.length;i++){
                if(ele == a[i]){
                    found = true;
                    a[i] = -1;
                    break;
                }
            }
            if(!found){
                return false;
            }
        }
        return true;
    }
}
