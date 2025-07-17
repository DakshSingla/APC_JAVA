import java.util.*;

public class test {
    // its an stack
    // public static void main(String[] args) {
    //     Deque <String>  st = new ArrayDeque<>();
    //     st.push("A");
    //      st.push("B");
    //       st.push("C");
    //       System.out.println("Top:" + st.peek());
    //       while (!st.isEmpty()) {
    //         System.out.println("Popped: "+ st.pop());
    //       }
    //}
    //--------------------------------------------------------------
    // its an ll
    // public static void main(String[] args) {
    //     LinkedList<String> list = new LinkedList<>();
    //     list.add("Banana");
    //      list.add("Apple");
    //       list.add("Mango");
    //       System.out.println("LinkedList (insertion order):"+list);
    //       list.removeFirst();
    //     System.out.println("After removing forst:" +list);
    //}
    //--------------------------------------------------------------------
    //its an priority que
    // public static void main(String[] args) {
    //     PriorityQueue<String> pq = new PriorityQueue<>();
    //     pq.add("Banana");
    //      pq.add("Apple");
    //       pq.add("Mango");
    //       System.out.println("priority queue (insertion order):"+pq);
    //       System.out.println("polling out : " + pq.poll());
    //     System.out.println("After poll:" +pq);
    // }
    //------------------------------------------------------------------
    // its about Array Deque

    public static void main(String[] args) { 
        Queue<String> queue = new ArrayDeque<>(); 
        queue.offer("A"); 
        queue.offer("B"); 
        queue.offer("C"); 
        System.out.println("Queue: " + queue);  // [A, B, C] 
        System.out.println("Peek: " + queue.peek());  // A 
        System.out.println("Polled: " + queue.poll());  // A 
        System.out.println("Queue after poll: " + queue);  // [B, C] 
    } 
}
