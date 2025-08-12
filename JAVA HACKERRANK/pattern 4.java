/*given a value n . Print the following statement

xxxx1

xxx12

xx123

x1234

12345

Input Format

input consit of a single integer N.

Constraints

1<=N<=100

Output Format

N line of Pattern as shown above

Sample Input 0

5
Sample Output 0

xxxx1
xxx12
xx123
x1234
12345
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            // Print x's
            for (int j = 1; j <= N - i; j++) {
                System.out.print("x");
            }
            // Print numbers from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Move to next line
            System.out.println();
        }

        sc.close();
    }
}
