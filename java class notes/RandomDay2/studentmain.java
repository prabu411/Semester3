package day5;
import java.util.Scanner;

public class studentmain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=Integer.parseInt(sc.nextLine());
        student[] arr= new student[size];
        int id;
        String name;
        student s;
        for (int i = 0; i < size; i++){
            System.out.println("Enter the "+(i+1)+"student Data");
            System.out.println("id");
            id=Integer.parseInt(sc.nextLine());

            System.out.println("Name :");
            name=sc.nextLine();
            s=new student(id,name);
            arr[i]=s;

        }
        for(student s1:arr){
            System.out.println(s1);
        }
    }
   
}
