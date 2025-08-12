import java.util.Scanner;

public class StudentMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        Student [] arr = new Student[size];
        Integer id;
        String name;
        Student s;
        for(int i=0;i<size;i++){
            System.out.println("Enter the "+(i+1)+" Student Data:");
            System.out.println("id:");
            id = Integer.parseInt(sc.nextLine());
            System.out.println("Name :" );
            name = sc.nextLine();
            s = new Student(id,name);
            arr[i] = s;
        }

        for(Student s1:arr){
            System.out.println(s1);
        }
    }
    
}
