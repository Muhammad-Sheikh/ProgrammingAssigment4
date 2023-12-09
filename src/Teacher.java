class Teacher extends Person {
    int employeeNumber, seniority;

    //Teacher constructor, takes employee number and first and last name as arguments
    public Teacher(int eNum, String firstN, String lastN) {
        super(firstN, lastN);
        setNum(eNum);
    }

    //Seniority setter
    public void setSeniority(int s) {
        seniority = s;
    }
    ///Employee number setter
    public void setNum(int n) {
        employeeNumber = n;
    }
    //Seniority getter
    public int getSeniority() {
        return seniority;
    }
    //Employee number getter
    public int getNum() {
        return employeeNumber;
    }
    //Compares current object seniority with another teacher objects seniority. If It's lower, the current seniority is higher so it flips the output and returns true instead of false.
    public boolean isSenior(Teacher t) {
        return !(getSeniority() < t.getSeniority());
    }
    //Outputs all Employee variables
    public String toString() {
        return "Employee Number is: " + getNum() +
                "\n\nTeacher Name is: " + super.getName() +
                "\n\nTeacher School is: " + getSchool() +
                "\n\nTeacher Age is: " + +getAge() +
                //The address is separated from the number by a space, so uses substring to output the first half
                "\n\nTeacher Address is: " + getContact().substring(0, getContact().lastIndexOf(" ")) +
                //Uses another substring to print the last half to print phone number
                "\n\nTeacher Phone Number is: " + getContact().substring(getContact().lastIndexOf(" ") + 1) +
                "\n\nTeacher Seniority is: " + getSeniority();
    }

}
