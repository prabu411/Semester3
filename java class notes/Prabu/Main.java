class One {
    public void display() {
        System.out.println("Hai from one");
    }
}

class Two {
    public void display() {
        System.out.println("Hai from two");
    }
}

public class Main {
    public static void main(String[] args) {
        One obj1 = new One();
        Two obj2 = new Two();

        obj1.display();
        obj2.display();

        if (args.length >= 2) {
            System.out.println("String " + args[0]);
            System.out.println("Integer " + Integer.parseInt(args[1]));
            System.out.println("Arguments length: " + args.length);
        } else {
            System.out.println("Insufficient arguments provided."); 
        }
    }
}

