import java.util.Arrays;

class Student extends Person{
    int studentNumber;
    String[][] coursesGrades = new String[4][2];
    public Student(String[] courses, int n, String firstN, String lastN)
 {
     super(firstN, lastN);


     coursesGrades = new String[][]{{"Math", "English", "Chemistry", "History"}, {"0", "0", "0", "0"}};

     for(int i = 0; i < 4;i++)
     {
         coursesGrades[0][i] = courses[i];
     }

     super.setAge(20);
 }

 public void setNumber(int n)
 {
     studentNumber = n;
 }
    public void test()
    {
        System.out.println(Arrays.deepToString(coursesGrades));
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
