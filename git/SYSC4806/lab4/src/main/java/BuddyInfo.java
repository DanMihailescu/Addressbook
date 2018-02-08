import java.io.Serializable;

public class BuddyInfo {
    private AddressBook addressbook;
    private String phoneNumber;
    private String name;
    private String address;
    private int age;

    public BuddyInfo(String n, String a, String p, int ag) {
        name = n;
        phoneNumber = p;
        address = a;
        age = ag;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddressBook(AddressBook addressbook) {
        this.addressbook = addressbook;
    }

    public String toString(){
        return (name + "$" + address + "$" + phoneNumber);
    }
}
