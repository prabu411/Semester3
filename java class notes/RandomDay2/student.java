package day5;

public class student {
    Integer id;
    String name;

    public student(){}

    public student(Integer id,String name)
{
    this.id=id;
    this.name=name;

}
public Integer getId(){
    return id;
}
public void setId(Integer id){
    this.id=id;
}
 @Override
    public String toString()
    {
        return "student [id="+ id + ", name=" + name + "]";
    }

}
