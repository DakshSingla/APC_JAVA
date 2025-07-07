import calculator.*;
import java.util.*; 
public class calculator_P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char i = sc.next().charAt(0);
        int a = sc.nextInt();
        
        int b = sc.nextInt();
        calc obj = new calc();
        
        switch (i){
            case '+':
            System.out.println(obj.sum(a, b));
            break;
            case '-':
            System.out.println(obj.min(a,b));
            break;
            case '*':
            System.out.println(obj.mul(a,b));
            break;
            case '/':
            System.out.println(obj.div(a,b));
            break;

        }
    }
    

}
