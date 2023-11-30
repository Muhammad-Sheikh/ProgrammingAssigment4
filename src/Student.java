class Student extends Person{
    int studentNumber;
    String[][] coursesGrades = new String[4][2];
    public Student()
 {
     coursesGrades = new String[][]{{"0", "0", "0", "0"}, {"0", "0", "0", "0"}};
 }

 public void setNumber(int n)
 {
     studentNumber = n;
 }

    public void setCourseGrade(double g, String course)
    {
        boolean foundCourse = false;
        for (int i = 0;i < 4;i++)
        {
            if("0".equals((coursesGrades[0][i])))
            {
                (coursesGrades[0][i]) = course;
                (coursesGrades[1][i]) = String.valueOf(g);
                foundCourse = true;
                break;
            }
        }
        if(!foundCourse)
        {
            System.out.println("A maximum limit of 4 courses has been reached!");
        }
    }

    public int getNumber()
    {
        return  studentNumber;
    }

    public double getAverage()
    {
        double tempSum = 0;
        for (int i = 0;i < 4;i++)
        {
            tempSum = tempSum + Double.parseDouble(coursesGrades[1][i]);
        }
        return (tempSum/numOfCourses());
    }

    public int numOfCourses()
    {
        int courseCounter = 0;
        for (int i = 0;i < 4;i++)
        {
            if(!("0".equals((coursesGrades[0][i]))))
            {
                courseCounter = courseCounter+1;
            }
        }
        return courseCounter;
    }
}
