import java.util.*;

public class test {
    public static void main(String[] args) {
        Deque <String>  st = new ArrayDeque<>();
        st.push("A");
         st.push("B");
          st.push("C");
          System.out.println("Top:" + st.peek());
          while (!st.isEmpty()) {
            System.out.println("Popped: "+ st.pop());
          }
    }
}
