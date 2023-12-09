public class Person {
    String firstName, lastName, adress;
    int phone, age;
    public Person(String firstN, String lastN)
    {
        firstName = firstN;
        lastName = lastN;
        phone = 0;
        age = 0;
        adress = null;
    }
    public Person(String firstN, String lastN, String a, int p, int age)
    {
        firstName = firstN;
        lastName = lastN;
        adress = a;
        phone = p;
        this.age = age;
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
