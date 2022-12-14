package task;

public final class Customer{
    String firstName;
    String secondName;
    int age;
    Address address;
    Customer MATURE_UNKNOWN_CUSTOMER;
    Customer NOT_MATURE_UNKNOWN_CUSTOMER;

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public Address getAddress() {
        return address;
    }

    public int getAge() {
            return age;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
}
