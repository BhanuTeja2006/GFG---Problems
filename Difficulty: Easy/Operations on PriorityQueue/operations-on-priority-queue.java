// Helper class Geeks to implement
// insert() and findFrequency()
class Geeks {

    // Function to insert element into the queue
    static void insert(PriorityQueue<Integer> q, int k) {
        q.add(k);

        // Your code here
        
        // Just insert k in q and don't return anything
    }

    // Function to find an element k
    static boolean find(PriorityQueue<Integer> q, int k) {
        return q.contains(k);

        
        // Your code here
        // If k is in q return true else return false
    }

    // Function to delete the max element from queue
    static int delete(PriorityQueue<Integer> q) {
        return q.poll();
        

        // Your code here
        // Delete the max element from q. The priority queue property might be useful
        // here
    }
}