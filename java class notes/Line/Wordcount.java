package Line;
//java program to read a file and Give Line count,Word count and charCount int the file
// Dont use seperate class for this program
import java.io.File;
import java.util.Scanner;
public class Wordcount {
    public static void main(String[] args) {
        File file = new File("Line/sample.txt");
        int lineCount = 0, wordCount = 0, charCount = 0;

        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                lineCount++;
                charCount += line.length();
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            sc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
