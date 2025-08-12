package day5.day5;

import java.util.*;

public class usermain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        user[] arr = new user[size];

        for (int i = 0; i < size; i++) {
            System.out.println("ID:");
            String id = sc.nextLine();
            System.out.println("Name:");
            String name = sc.nextLine();
            System.out.println("Address:");
            String address = sc.nextLine();
            System.out.println("Mobile No:");
            String mobileno = sc.nextLine();

            user u = new user(id, name, address, mobileno);
            arr[i] = u;
        }

        for (user u : arr) {
            System.out.println(u);
        }
    }
}
