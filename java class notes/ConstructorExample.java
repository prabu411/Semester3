class A{
    public A(int num1) {
        System.out.println("Hai from java programming" + num1);
    }
    public void display(){
        System.out.println("Display from A");
    }
}
class B extends A{
    public B(int num1){
        super(num1);
        System.out.println("Value in B" + num1);
    }
}

public class ConstructorExample {
 public static void main(String[] args) {
    B b1=new B(10);
    b1.display();

 }   
}
