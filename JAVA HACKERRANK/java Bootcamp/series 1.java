import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();  

        int[] series = new int[N];

        if (N >= 1) series[0] = 2;
        if (N >= 2) series[1] = 3;

        for (int i = 2; i < N; i++) {
            if ((i + 1) % 2 == 0) {
            
                series[i] = series[i - 1] * (i + 1) - 1;
            } else {
                
                series[i] = series[i - 1] * (i + 1) + 1;
            }
        }

       
        for (int i = 0; i < N; i++) {
            System.out.print(series[i] + " ");
        }

        sc.close();
    }
}
