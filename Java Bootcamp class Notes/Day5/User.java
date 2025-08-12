public class User {
    String id;
    String name;
    String address;
    String mobileNo;
    public User() {
    }
    public User(String id, String name, String address, String mobileNo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.mobileNo = mobileNo;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getMobileNo() {
        return mobileNo;
    }
    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", address=" + address + ", mobileNo=" + mobileNo + "]";
    }

    
    
}
