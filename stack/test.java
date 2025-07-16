import java.util.*;

public class test {
    public static void main(String[] args) {
        Stack <String>  st = new Stack<>();
        st.push("A");
         st.push("B");
          st.push("C");
          System.out.println("TOp:" + st.peek());
          while (!st.isEmpty()) {
            System.out.println("Popped: "+ st.pop());
          }
    }
}
