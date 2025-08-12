import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();         
        int product = 1;              

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();   
            product *= val;           
        }

        System.out.println(product);  // Output the result
        sc.close();
    }
}
