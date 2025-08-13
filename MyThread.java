import java.util.*;
public class MyThread extends Thread{
    @Override
    public void run(){
        for(int i= 1;i<=5;i++){
            System.out.println(i+" " + Thread.currentThread().getName());
        }
    }
}
//.......-
//krwogjew

//Hello 
//g444t0uty8y93ytu3409tut9
//lkhgiotyefbntrnbr;objrtp