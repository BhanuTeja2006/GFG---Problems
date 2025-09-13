/*You are required to complete below methods*/

class GfG {
    /*inserts an element x at
    the back of the ArrayList A */
    void add_to_ArrayList(ArrayList<Integer> A, int x) {
        // Your code here
        A.add(x);
    }

    /*sort the ArrayList A in ascending order*/
    void sort_ArrayList_Asc(ArrayList<Integer> A) {
        Collections.sort(A);
        
        // Your code here
    }

    /*reverses the ArrayList A*/
        
    void reverse_ArrayList(ArrayList<Integer> A) {
        Collections.reverse(A);
        // Your code here
    }

        
    /*returns the size of the ArrayList A */
    int size_Of_ArrayList(ArrayList<Integer> A) {
        return A.size();
        // Your code here
    }
        

    /*sorts the ArrayList A in descending order*/
    void sort_ArrayList_Desc(ArrayList<Integer> A) {
        Collections.sort(A,Collections.reverseOrder());
        // Your code here
    }
        

    /*prints space separated
    elements of ArrayList A*/
    void print_ArrayList(ArrayList<Integer> A) {
        for(Integer a:A){
            System.out.print(a+" ");
        }
            
        // Your code here
    }
}