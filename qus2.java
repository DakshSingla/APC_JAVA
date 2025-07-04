//create a functional interface using lambda function for checking the email if it valid or not 
interface emailvali{
    boolean isvalid(String email);
}
public class qus2 {
    public static void main(String[] args) {
        emailvali obj = (String email) ->{
            return email.contains("@") && email.endsWith(".com");
        };
        System.out.println(obj.isvalid("dakshingla.be23gmail.com"));
    }
}
