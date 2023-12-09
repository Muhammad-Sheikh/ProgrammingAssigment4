public class Person {
    //Variable declaration
    String firstName, lastName, address;
    int phone, age;

    //First constructor to set name, sets all other values to 0/null
    public Person(String firstN, String lastN) {
        firstName = firstN;
        lastName = lastN;
        phone = 0;
        age = 0;
        address = null;
    }

    //Second constructor with more variables
    public Person(String firstN, String lastN, String a, int p, int age) {
        firstName = firstN;
        lastName = lastN;
        address = a;
        phone = p;
        this.age = age;
    }
    //Name setter
    public void setName(String firstN, String lastN) {
        firstName = firstN;
        lastName = lastN;
    }
    //Contact setter
    public void setContact(int phoneNumber, String newAddress) {
        phone = phoneNumber;
        address = newAddress;
    }
    //Age setter
    public void setAge(int a) {
        age = a;
    }
    //Returns school name when called as a string
    static String getSchool() {
        return "Marc Garneau Collegiate Institute";
    }
    //Age getter
    public int getAge() { return age; }
    //Name getter
    public String getName() {
        return firstName + " " + lastName;
    }
    //Contact getter, returns address and phone separated by a space
    public String getContact() {
        return address + " " + phone;
    }
    //Outputs all variables in Person Class
    public String toString() {
        return "\n\nPerson Name is: " + getName() +
                "\n\nPerson School is: " + getSchool() +
                "\n\nPerson Age is: " + getAge() +
                "\n\nPerson Address is: " + getContact().substring(0, getContact().lastIndexOf(" ")) +
                "\n\nPerson Phone Number is: " + getContact().substring(getContact().lastIndexOf(" ") + 1);
    }


}
