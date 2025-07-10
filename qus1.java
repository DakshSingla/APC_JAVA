//create a functional interface of a operation having a function will return arithmetic operation use the lambda expretion that calculate the sum of a2 num and product of 2 num
interface abc{
    int display(int num1, int num2);
}
public class qus1 {
    public static void main(String[] args) {
        abc obj = (num1,num2) -> num1+num2;
        abc obj1 = (num1,num2) -> num1*num2;
        System.out.println(obj.display(10,2));
        System.out.println(obj1.display(10,2));

    }
}
///
