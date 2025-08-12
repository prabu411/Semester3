public class Student{
    Integer id;
    String name;
    static String collegeName;

    public Student(){

    }

    public Student(Integer id,String name){
        this.id = id;
        this.name = name;
    }

    public void display(){
        System.out.println("Student Details");
        System.out.println("Id "+this.id);
        System.out.println("Name "+this.name);
        System.out.println("College Name "+collegeName);

    }
}