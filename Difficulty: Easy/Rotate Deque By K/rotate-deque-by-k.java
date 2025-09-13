class Solution {
    public static void left_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int k) {
        int size = deque.size();
        if (size == 0) return;
        k = k % size; 
        for (int i = 0; i < k; i++) {
            int front = deque.pollFirst();
            deque.addLast(front);
        }
    }
    public static void right_Rotate_Deq_ByK(ArrayDeque<Integer> deque, int k) {
        int size = deque.size();
        if (size == 0) return;
        k = k % size; 
        for (int i = 0; i < k; i++) {
            int rear = deque.pollLast();
            deque.addFirst(rear);
        }
    }
}