import java.io.*;



    class Student implements Serializable{
        int id = 101;
        String name = "Daksh Singla";
    }
public class basic {
    //public static void main(String[] args) {
        // File file = new File("example.txt");
        // System.out.println("File exists : "+ file.exists()); // tell that the file is exists otr not
        // System.out.println("is file  : " + file.isFile()); // tell the type of file 
        // System.out.println("is file  : " + file.isDirectory());
    //}
    //---------------------------------------------------------------------------------------

    // it is used to check weather the file is empty or not on empty it will throw an exception
    // public static void main (String[] args) throws Exception{
    //     FileWriter write = new FileWriter("example.txt");
    //     write.write("Hello world");
    //     write.close();
    //     FileReader reader = new FileReader("example.txt");
    //     int ch;
    //     while((ch = reader.read()) !=-1){
    //         System.out.println((char) ch);
    //     }
    // }
    //----------------------------------------------------------------------------------

    // the buffer meant to that collect teh data in a batch form and then print it into one go instead to print word by word by .write() only
    // public static void main (String[] args) throws IOException{
    //     BufferedWriter bw = new BufferedWriter(new FileWriter("example.txt"));
    //     bw.write("Line 1\n Line 2");
    //     bw.close();
    //     BufferedReader br = new BufferedReader(new FileReader("example.txt"));
    //     String line;
    //     while((line = br.readLine()) !=null){
    //         System.out.println(line);
    //     }
    //     br.close();
    // }
    //--------------------------------------------------------------------------------------------

     public static void main (String[] args) throws Exception{
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("example.txt"));
        out.writeObject(new Student());
        out.close();
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("example.txt"));
        Student s = (Student) in.readObject(); 
        System.out.println(s.id + " " +s.name);
        in.close();
    }
}
