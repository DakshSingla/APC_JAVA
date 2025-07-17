import java.util.*;
public class iterator {
    public static void main(String[] args) {
        List<String> li = new ArrayList<>();
        li.add("Apple");
        li.add("Banana");
        li.add("Cherry");
        Iterator<String> iterator = li.iterator();
        while(iterator.hasNext()){
            String lu = iterator.next();
            System.out.println(lu);
        }
    }
}
//---
