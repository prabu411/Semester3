import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CharIO {
    public static void main(String[] args) throws IOException {
        char a;
        Character b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = (char)br.read();
        b = (char)br.read();
        System.out.println(a+ " "+ b);
    }
    
}
