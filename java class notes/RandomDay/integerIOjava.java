import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IntegerIO{
    public static void main(String[] args) throws IOException {
        int a;
        
    }
}

public class IntegerIOJava {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter an integer: ");
        try {
            String input = reader.readLine();
            int number = Integer.parseInt(input);
            System.out.println("You entered: " + number);
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Invalid integer format: " + e.getMessage());
        }
    }
}