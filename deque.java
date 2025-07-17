import java.util.*;
public class deque {
    // public static void main(String[] args) {
    //     Deque<String> dq = new ArrayDeque<>();
    //     dq.addFirst("Start");
    //     dq.addLast("Middle");
    //     dq.addLast("End");
    //     System.out.println("Deque contents: " + dq);
    //     System.out.println("Head : " + dq.peekFirst());
    //     System.out.println("Tail: " + dq.peekLast());
    //     dq.pollFirst();
    //     dq.pollLast();
    //     System.out.println("After removal: "+ dq);
    // }

    // check weather a string is palindrome or not


    public static void main(String[] args) {
        Deque <Integer> dq = new ArrayDeque<>();
        boolean sem = true;
        dq.addFirst(1);
        dq.addLast(3);
        dq.addLast(2);
        dq.addLast(1);
        for(int i = 0;i< dq.size()/2;i++){
            if(dq.peekFirst() == dq.peekLast()){
                sem = false;
            }
            dq.pollFirst();
            dq.pollLast();
        }
        if(sem){
        System.out.println("yes");}
        else System.out.println("not");
    }
}
