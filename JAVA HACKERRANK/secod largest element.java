/*Given an array of integers, our task is to write a program that efficiently finds the second-largest element present in the array.

Example: Input: arr[] = {12, 35, 1, 10, 34, 1} Output: 34.

Input: arr[] = {10, 5, 10} Output: 5.

Input: arr[] = {10, 10, 10} Output: -1.

Input Format

N -> Size of the Array N+1 -> N Array Values

Constraints

1<= N <= 100

Output Format

Single Integer which will be the Second largest Element in the Array or -1 if no second largest element is present.

Sample Input 0

6
12 35 1 10 34 1
Sample Output 0

34
Sample Input 1

3
10 5 10
Sample Output 1

5
Sample Input 2

3
10 10 10
Sample Output 2

-1 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();       // Size of array
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize variables
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            int num = arr[i];

            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }

        // If second remains MIN_VALUE, no second-largest exists
        if (second == Integer.MIN_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println(second);
        }

        sc.close();
    }
}
