//08-08-2025
class A{
    static Integer num1=10;
    static{
        System.out.println("hai from static block");
    
    }
    public A(){
        System.out.println("Hai from A constructor");
        
    }

}
public class staticclassexample{
    public static void main(String[] args) {
        System.out.println("Value of num1: " + A.num1);
        A a = new A();
        B b = new B();
    }
}

class B {
    public B() {
        System.out.println("Hello from B constructor");
    }
}
