
class Two{
    public void display(){
        System.out.println("Hai from Two");
    }
}

class Main{
    public static void main(String args[]){
        One o = new One();
        Two t = new Two();
        o.display();
        t.display();

        System.out.println("String "+args[0]);
        System.out.println("Integer "+Integer.parseInt(args[1]));
    }
}