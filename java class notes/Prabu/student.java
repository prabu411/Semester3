public class student {
    int id;
    String name;
    String collegeName;
    static String address;

    public student(int id, String name, String collegeName, String address) {
        this.id = id;
        this.name = name;
        this.collegeName = collegeName;
        student.address = address;
    }

    public void printStudent() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("College: " + collegeName);
        System.out.println("Address: " + address);
        System.out.println();
    }

    public static void main(String[] args) {
        student s1 = new student(1, "Arun", "SECE", "Chennai");
        student s2 = new student(2, "Anu", "SECE", "Coimbatore");

        s1.printStudent();
        s2.printStudent();
    }
}
