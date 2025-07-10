import java.util.*;

public class javaji {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String username = sc.nextLine();
        String password = sc.nextLine();
        
        try {
            // Check if password has at least 5 characters
            if (password.length() < 5) {
                throw new Exception("S");
            }

            // Check if password contains at least one digit
            boolean hasDigit = false;
            for (char ch : password.toCharArray()) {
                if (Character.isDigit(ch)) {
                    hasDigit = true;
                    break;
                }
            }
            if (!hasDigit) {
                throw new Exception("C");
            }

            // If all validations pass
            System.out.println("Login successful");

        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}

//write a java code
// input - username, password
// password should be atleast have 5 characters if not then throw a exception as a char S
// if the password does not contain a digit then throw a exception as a char C