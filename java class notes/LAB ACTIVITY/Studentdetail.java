// program to store student details of no of student name and roll no and marks of 3 subject and sort it in ranking wise
import java.util.*;

class Student {
    int rollno;
    String name;
    double[] marks = new double[3];
    double total;

    public Student(int rollno, String name, double[] marks) {
        this.rollno = rollno;
        this.name = name;
        this.marks = marks;
        this.total = marks[0] + marks[1] + marks[2];
    }
}

public class Studentdetail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int num = sc.nextInt();
        Student[] arr = new Student[num];

        for (int i = 0; i < num; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll No: ");
            int rollno = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            double[] marks = new double[3];
            for (int j = 0; j < 3; j++) {
                System.out.print("Marks for subject " + (j + 1) + ": ");
                marks[j] = sc.nextDouble();
            }
            arr[i] = new Student(rollno, name, marks);
        }

        Arrays.sort(arr, new Comparator<Student>() {
            public int compare(Student a, Student b) {
                if (b.total > a.total) return 1;
                else if (b.total < a.total) return -1;
                else return 0;
            }
        });

        System.out.println("\nStudent Details sorted by ranking:");
        for (int i = 0; i < num; i++) {
            System.out.println("Rank " + (i + 1) + ":");
            System.out.println("Roll No: " + arr[i].rollno);
            System.out.println("Name: " + arr[i].name);
            System.out.println("Marks: " + arr[i].marks[0] + ", " + arr[i].marks[1] + ", " + arr[i].marks[2]);
            System.out.println("Total: " + arr[i].total);
        }
    }
}
