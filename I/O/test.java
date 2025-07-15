import java.io.File;

public class test {
    public static void main(String[] args) {
        File file = new File("example.txt");
        System.out.println("File exists : "+ file.exists()); // tels that the fiel is exists otr not
        System.out.println("is file  : " + file.isFile()); // tell that the fiel is fiewl 
        System.out.println("is file  : " + file.isDirectory());
    }
}
