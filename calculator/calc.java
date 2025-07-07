package calculator;

public class calc {
    public int sum(int a,int b){
        return a+b;
    }
    public int min(int a, int b){
        if(a>b){
            return (a-b);
        }
        else
        return (b-a);
    }
    public int mul(int a, int b){
        return (a*b);
    }
    public int div(int a, int b){
        return (a/b);
    }
}
//create a package name calculator different classes of arithmetic operation input from user according to imput theh classes will be called