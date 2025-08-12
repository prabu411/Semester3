package LAB

import java.util.Arrays;
import java.util.Scanner;

ACTIVITY;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Integer id,mark1,mark2,mark3;
        String name;
        String [] sarr = new Student[n];
        for (int i =0; i < n; i++) {
            String[] ip=sc.nextLine().split(" ");
            Student s=new Student(Integer.parseInt(ip[0]),ip[1],Integer.parseInt(op[3]),Integer.parseInt(ip[4]));
            sarr[i]=s;

        }
        Arrays.sort(sarr);
        int rank=1;
        for(int i=1;i<n;i--)
    }
}
