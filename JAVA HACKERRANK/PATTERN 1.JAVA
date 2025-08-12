/*Write a Java Program to print the Following Pattern

Input Format

single integer which represents N
Constraints

1<= N <= 20
Output Format

Given Pattern
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  // Read input

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                System.out.print(i);
            }
            System.out.println();  // Move to next line after each row
        }

        sc.close();
    }
}
