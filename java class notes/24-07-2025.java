
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class TwentyFour_07_2025 {
    public static void main(String[] args) {
        try{
            FileWriter fw=new FileWriter("Input.txt",false);
            BufferedWriter bw=new BufferedWriter(fw);
            PrintWriter pw=new PrintWriter(bw);
            pw.println("Welcome to a Java Program");
            pw.println("Writting to File");
            pw.println("|| CSE-A File Writer");
            pw.close();
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
