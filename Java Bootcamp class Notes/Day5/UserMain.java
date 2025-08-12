import java.util.Scanner;

public class UserMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = Integer.parseInt(sc.nextLine());
        User[] arr = new User[size];
        String id,name,address,mobileNo;
        User u;
        for(int i=0;i<size;i++){
            System.out.println("id");
            id = sc.nextLine();
            System.out.println("Name");
            name = sc.nextLine();
            System.out.println("Address");
            address = sc.nextLine();
            System.out.println("MObile No");
            mobileNo = sc.nextLine();
            u = new User(id, name, address, mobileNo);   
            arr[i] = u;
        }

        for(User u1:arr){
            System.out.println(u1);
        }
    }
    
}
