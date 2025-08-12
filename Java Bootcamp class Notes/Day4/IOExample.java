import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOExample {
    public static void main(String[] args) throws IOException {
        Integer a;
        Float b;
        char c,d;
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        a = Integer.parseInt(br.readLine());
        c = br.readLine().charAt(0);
        b = Float.parseFloat(br.readLine());
        d = br.readLine().charAt(0);
        str = br.readLine();
        System.out.println(a+" "+c+" "+b+" "+d+" "+str);
        br.close();
    }
    
}
