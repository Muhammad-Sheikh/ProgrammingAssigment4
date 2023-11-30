class Teacher extends Person {
    int employeeNumber, seniority;

    public void setSeniority(int s)
    {
        seniority = s;
    }

    public void setNum(int n)
    {
        employeeNumber = n;
    }

    public int getSeniority()
    {
        return seniority;
    }

    public int getNum()
    {
        return employeeNumber;
    }

    public boolean isSenior(Teacher t)
    {
        if(t.getSeniority() < seniority)
        {
            return false;
        }else
        {
            return true;
        }
    }

}
