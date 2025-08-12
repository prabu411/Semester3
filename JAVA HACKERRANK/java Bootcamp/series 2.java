//Given a Integer N. Print the N Integers given in the series. 8 19 52 151



import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int term = 8;
        int add = 3;

        for (int i = 1; i <= N; i++) {
            System.out.print(term + " ");

            // Calculate next term
            term = term * 2 + add;

            // Update the added value for the next iteration
            add = add * 3 + 5;
        }

        sc.close();
    }
}



