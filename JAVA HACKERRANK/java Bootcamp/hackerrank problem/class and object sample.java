import java.util.ArrayList;
import java.util.Scanner;

// Student class
class Student {
    private int rollNo;
    private String name;
    private String address;
    private long mobileNo;

    public Student(int rollNo, String name, String address, long mobileNo) {
        this.rollNo = rollNo;
        this.name = name;
        this.address = address;
        this.mobileNo = mobileNo;
    }

    @Override
    public String toString() {
        return "Name :" + name + ".\nMobile No:" + mobileNo;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> studentList = new ArrayList<>();

        while (true) {
            System.out.println("Enter the Roll No:");
            int rollNo = sc.nextInt();
            System.out.println(rollNo); // echo input

            sc.nextLine(); // consume leftover newline

            System.out.println("Enter the Name:");
            String name = sc.nextLine();
            System.out.println(name); // echo input

            System.out.println("Enter the Address:");
            String address = sc.nextLine();
            System.out.println(address); // echo input

            System.out.println("Enter the Mobile No:");
            long mobileNo = Long.parseLong(sc.nextLine());
            System.out.println(mobileNo); // echo input

            studentList.add(new Student(rollNo, name, address, mobileNo));

            System.out.println("Do You want to add More Students(Y/N):");
            String choice = sc.nextLine();
            System.out.println(choice); // echo input
            if (choice.equalsIgnoreCase("n")) {
                break;
            }
        }

        for (Student s : studentList) {
            System.out.println(s);
        }

        sc.close();
    }
}
