package day4;
import java.io.*;

public class FloatIO {
    public static void main(String[] args) throws IOException {
        float a;
        Float b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a float value: ");
        a = Float.parseFloat(br.readLine());
        System.out.print("Enter another float value: ");
        b = Float.valueOf(br.readLine());
        System.out.println(a + " " + b);
    }
}




