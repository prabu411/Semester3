package day5.day5;

public class user {
    String id, name, Address, mobileno;

    public user(String id, String name, String Address, String mobileno) {
        this.id = id;
        this.name = name;
        this.Address = Address;
        this.mobileno = mobileno;
    }

    @Override
    public String toString() {
        return "user [id=" + id + ", name=" + name + ", Address=" + Address + ", mobileno=" + mobileno + "]";
    }
}