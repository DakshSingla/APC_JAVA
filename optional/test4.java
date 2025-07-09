import java.util.Optional;

public class test4 {
    public static void main(String[] args) {
        String result = getName();
        if(result != null){
            System.out.println(result);
        }
        else{
            System.out.println("Not value");
        }
        Optional<String> name = Optional.of("Chitkara");
        name.ifPresent(n -> System.out.println("Hello, " +n));
    }
     public static String getName(){
        return null;
    }
}
