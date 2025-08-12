
//append to input.txt using FileWriter and BufferedWriter; the input should be taken from the user
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class TwentyFour_07_2025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text to append to Input.txt (type 'exit' to finish):");
        try {
            FileWriter fw = new FileWriter("Input.txt", true); // append mode
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            while (true) {
                String input = scanner.nextLine();
                if (input.equalsIgnoreCase("exit")) {
                    break;
                }
                pw.println(input);
            }
            pw.close();
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
