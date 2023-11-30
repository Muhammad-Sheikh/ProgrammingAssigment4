public class Person {
    String firstName, lastName, adress;
    int phone, age;
    public Person()
    {

    }

    public void setName(String firstN, String lastN)
    {
        firstName = firstN;
        lastName = lastN;
    }

    public void  setContact(int phoneNumber, String newAdress)
    {
        phone = phoneNumber;
        adress = newAdress;
    }

    public void setAge(int a)
    {
        age = a;
    }
    static String getSchool()
    {
        return "Marc Garneua";
    }

    public String getName()
    {
        return firstName + " " + lastName;
    }

    public String getContact()
    {
        return adress;
    }

    public String toString()
    {
        return null;
    }


}
