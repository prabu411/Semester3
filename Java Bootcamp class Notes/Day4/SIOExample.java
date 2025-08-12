import java.util.Scanner;
public class SIOExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        char b;
        float c;
        char d;
        a = sc.nextInt();
        sc.nextLine();
        b = sc.nextLine().charAt(0);
        c = Float.parseFloat(sc.nextLine());
        d = sc.nextLine().charAt(0);
        System.out.println(a+" "+b+" "+c+" "+d);
    }
    
}
