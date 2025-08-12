// write a java programme toList employee name with roles create a class with roll name and roll id Employee class with 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Employee {
    private String name;
    private String role;
    private int id;

    public Employee(String name, String role, int id) {
        this.name = name;
        this.role = role;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                ", id=" + id +
                '}';
    }
}