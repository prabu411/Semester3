
import java.io.File;
import java.util.Scanner;


public class TwentyThree_07_2025 {
    public static void main(String[] args) {
        File file=new File("Sample.txt");
        try {
            Scanner sc=new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}