import java.util.*;
public class MyThread  {
    @Override
    public void run(){
        for(int i= 1;i<=5;i++){
            System.out.println(i+" " + Thread.currentThread().getName());
        }
    }
}
