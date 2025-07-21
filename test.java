import java.util.*;
// // class vehicle{
//         int mileage = 444;
//         double price = 483425;
//         String color = "red";
//         String brand = "eerttggh";
//         int model = 6767;
//         void data(int milage, double price){
          
//         }
//         public void model(String color, String brand, int model,int milage, double price){
//             this.color = color;
//             this.brand = brand;
//             this.model = model;
//             this.mileage = milage;
//             this.price = price;

//             System.out.println("col" + this.color);     
//             System.out.println("col" + this.brand);
//             System.out.println("col" + this.model);
//             System.out.println("col" + this.mileage);
//             System.out.println("col" + this.price);
//         } 
//     };

// *********abstract class************
    // abstract class abc {        
    //     public int a = 10;
    //     public void display(){
    //         System.out.println(a);
    //     }
    //     abstract void show();
    // }
    // class B extends abc{
    //     void show(){
    //         System.out.println("class B");
    //     }
    // }

// *********interface********
    // interface abc{
    //     public int a = 10;
    //     void display();
    // }
    //     interface def{
    //     void abc1();
    // }
    // class B implements abc,def{
    //     public void display(){
    //         System.out.println("called fro, clsss b");
    //     }
    //     public void abc1(){
    //         System.out.println("calling from class ss");
    //     }
    // }

public class test { 
    // static int display(int[] arr) throws Exception{
    //     return arr[6];
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // vehicle obj = new vehicle();
        //  obj.model("Black", "Honda", 2024, 18, 750000);

        // B obj = new B();
        // obj.show();

        // B obj = new B();
        // obj.display();
        // obj.abc1();

        // int a = 5,b= 5;
        // try{
        //     System.out.println(a/b);
        // }
        // catch(ArithmeticException e){
        //     System.out.println(e);
        //           System.out.println("by by");
        // }

        // int a = 5,b= 5;
        // int arr[] = new int[4];
        // try{
        //     System.out.println("hello");
        //     System.out.println(arr[6]);
        //     System.out.println(a/b);
        // }
        // catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
        //     System.out.println(e);
        //     System.out.println("by by");
        // }

        // int a = 5,b= 5;
        // int arr[] = new int[4];
        // try{
        //     display(arr);
        // }
        // catch (Exception e) {
        //     System.out.println(e);
        //     System.out.println("by by");
        // }

        System.out.println("enter age = ");
        try{
            int age = sc.nextInt();
            if(age<0){
                throw new AgeException("age is wrong");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class AgeException extends Exception{
    public AgeException (String message){
        super(message);
    }
}
// data member about milage and price of vehicle with the help of a member function modelprint a color brand and the model of the vehicle
// +][][][][][][][[][][]]
//hrubhpe