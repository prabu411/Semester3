//Given an Integer N. Print the N numbers corresponding to the given Series.

//2 1 2 4 2 5 6 3 8

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        ArrayList<Integer> series = new ArrayList<>();

        int a = 2, b = 1, c = 2;
        int count = 0;

        while (count < N) {
            if (count < N) {
                series.add(a);
                count++;
            }
            if (count < N) {
                series.add(b);
                count++;
            }
            if (count < N) {
                series.add(c);
                count++;
            }

            // Update for next group
            a = b + c;     // New 'a'
            b++;           // Increment 'b'
            c += 2;        // 'c' jumps by 2
        }

        for (int i = 0; i < N; i++) {
            System.out.print(series.get(i) + " ");
        }

        sc.close();
    }
}
