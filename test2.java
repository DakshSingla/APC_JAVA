// abstract class abc{
//     abstract void display();
//     abstract void show();
// }
// public class test2 {
//     public static void main(String[] args) {
//         abc obj = new abc(){
//             public void display(){
//                 System.out.println("its has shown display");
//             }
//             public void show(){
//                 System.out.println("so it is an show function");
//             }
//         };

//         obj.display();
//         obj.show();
//     }
// }

//_____________________________________________________________________________________

// interface abc{
//     void display();
// }
// public class test2 {
//     public static void main(String[] args) {
//         abc obj = () -> {
//                 System.out.println("its has shown functional interface");
//                 System.out.println("it will only uses a single function");
//         };
//         obj.display();
//     }
// }

//_________________________________________________

// interface abc{
//     void display(String nm);
// }
// public class test2 {
//     public static void main(String[] args) {
//         abc obj = (nm) -> {
//             System.out.println("its known as lambda function" + nm);
//         };

//         obj.display("nnnnn");
//     }
// }

//___________________________________________

// interface abc{
//     boolean display(int nm);
// }
// public class test2 {
//     public static void main(String[] args) {
//         abc obj = (nm) -> nm%2==0;
//         System.out.println(obj.display(20));
    
//     }
// }

//+++++++++++++++++++++++++++++++++

// class abc{
//     public void display(int x){
//         System.out.println("Hello jeee");
//     }
// }
// class def extends abc {
//     public void display(){
//         System.out.println("hmmmm okkkkkk");
//     }
// }
// public class test2 {
//     public static void main(String[] args) {
//         abc obj  = new abc();
//         obj.display(34);
//     }
// }

//_________________________________________________

// class abc{
//     @Deprecated
//     //     it means this thing still exists, but maybe stop using it for eg.. we are using an product burt for the updation of the product has beeen stoped
//     public void display(int x){
//         System.out.println("Hello jeee");
//     }
// };
// public class test2 {
//     public static void main(String[] args) {
//         abc obj  = new abc();
//         obj.display(34);
//     }
// }

//========================================================

// class abc{
//     @Deprecated
//     public void display(){
//         System.out.println("Hello jeee");
//     }
// };
// public class test2 {
//     @SuppressWarnings({"checked","deprecated"})
//     public static void main(String[] args) {
//         abc obj  = new abc();
//         obj.display();
//     }
// }

// -----------------------------------------
// import wil automatically add after adding @....

// import java.lang.annotation.ElementType;
// import java.lang.annotation.Retention;
// import java.lang.annotation.RetentionPolicy;
// import java.lang.annotation.Target;

// @Target(ElementType.TYPE)
// @Retention(RetentionPolicy.RUNTIME)
// @interface abc{

//     int values() default 0;
//     String name() default "chitkara";
// }
// @abc(values=555,name="sham")
// class def{

// }
// public class test2{
//     public static void main(String[] args) {
//     def dm = new def();
//     Class c = dm.getClass(); // Gets the class object for 'def'
//     System.out.println(c.getName()); // Prints class name
//     abc ab = (abc) c.getAnnotation( abc.class); // Fetch annotation
//     System.out.println(ab.values()); // Prints: 555
//     System.out.println(ab.name()); // Prints: chitkara
//     }
// }

// ____________________________________________________________________

