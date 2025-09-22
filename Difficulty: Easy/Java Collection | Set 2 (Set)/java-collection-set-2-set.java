/* You are required to complete below methods */
class GfG {
    /*inserts an element x to the set s */
    void insert(Set<Integer> s, int x) {
        // Your code here
        s.add(x);
    }

    /*prints the contents of the set s in ascending order */
    void print_contents(Set<Integer> s) {
        List<Integer> sl = new ArrayList<Integer>();
        for (int i : s){
            sl.add(i);
        }
        Collections.sort(sl);
        for (int i : sl){
            System.out.print(i+" ");
        }
   }
        // Your code here

    /*erases an element x from the set s */
        
    void erase(Set<Integer> s, int x) {
        s.remove(x);
        // Your code here
    }

        
    /*returns the size of the set s */
    int size(Set<Integer> s) {
        return s.size();
        // Your code here
    }

        
    /*returns 1 if the element x is
    present in set s else returns -1 */
    int find(Set<Integer> s, int x) {
        if(s.contains(x)){
            return 1;
        }
        return -1;
        // Your code here
    }
}