

class Two{
    public void dispaly(){
        System.out.println("Hai from two");
    }
}

class First{
    public static void main(String[] args) {
        One o = new One();
        Two t = new Two();
        o.display();
        t.dispaly();
    }
}