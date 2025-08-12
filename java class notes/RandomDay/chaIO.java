package day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class chaIO {
    public static void main(String[] args) throws IOException {
        char a;
        char b;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter two characters:[NO-SPACCE] ");
        String input = br.readLine();
        a = (input.length() > 0) ? input.charAt(0) : '\0';
        b = (input.length() > 1) ? input.charAt(1) : '\0';
        System.out.println("You entered: " + a + " and " + b);
        System.out.println("Character a: " + a);
        System.out.println("Character b: " + b);
    }
}
