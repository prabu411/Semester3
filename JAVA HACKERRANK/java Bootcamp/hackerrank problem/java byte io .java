import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        byte value = sc.nextByte();  // Read byte input
        System.out.println(value);   // Print the same

        sc.close();
    }
}
