import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char ch = sc.next().charAt(0);  // Read first character of input
        System.out.println(ch);         // Print the character

        sc.close();
    }
}
