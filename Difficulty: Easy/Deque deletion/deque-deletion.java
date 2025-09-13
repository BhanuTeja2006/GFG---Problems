import java.util.*;

class Solution {
    public static void eraseAt(ArrayDeque<Integer> deq, int X) {
        List<Integer> list = new ArrayList<>(deq);
        if (X >= 0 && X < list.size()) {
            list.remove(X);
        }
        deq.clear();
        deq.addAll(list);
    }

    public static void eraseInRange(ArrayDeque<Integer> deq, int start, int end) {
        if (start == end) return;
        List<Integer> list = new ArrayList<>(deq);
        if (start >= 0 && end <= list.size() && start < end) {
            list.subList(start, end).clear();
        }
        deq.clear();
        deq.addAll(list);
    }

    public static void eraseAll(ArrayDeque<Integer> deq) {
        deq.clear();
    }
}
