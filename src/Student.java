import java.text.DecimalFormat;

class Student extends Person {
    //Variable declaration
    int studentNumber;
    String[][] coursesGrades = new String[4][2];

    //Student constructor, takes name in, a list of courses and student number.
    public Student(String[] courses, int n, String firstN, String lastN) {
        super(firstN, lastN);
        //Initializes the 2d array with basic information so there are placeholders encase not all courses are filled.
        coursesGrades = new String[][]{{"Course", "Course", "Course", "Course"}, {"0", "0", "0", "0"}};

        //Sets the first row of the 2d array with the 1d array that is parsed as an argument
        for (int i = 0; i < courses.length; i++) {
            coursesGrades[0][i] = courses[i];
        }
        //Sets student number with the n variable
        setNumber(n);
    }

    //Setter for student number
    public void setNumber(int n) {
        studentNumber = n;
    }

    //Sets course grade when given a course and its grade
    public void setCourseGrade(double g, String course) {
        boolean foundCourse = false;
        //Loops through 0-3 to go through an entire row of the 2d  array
        for (int i = 0; i < 4; i++) {
            //If the inputted course is found in the courses row of the 2d array, sets its grade to the second row with same column.
            if (course.equals(coursesGrades[0][i])) {
                coursesGrades[1][i] = String.valueOf(g);
                //Makes found courses true, so the error message won't print
                foundCourse = true;
                //Breaks as we already found the one specified course.
                break;
            }
        }
        //If the course isn't found in the list, lets the user know a valid list of courses.
        if (!foundCourse) {
            System.out.println("Error: Course Inputted was not found. The list of valid courses is Math, English, History & Chemistry.");
        }
    }
    //Getter for student number
    public int getNumber() {
        return studentNumber;
    }

    //Gets average across all courses
    public double getAverage() {
        DecimalFormat dd = new DecimalFormat("#.##");
        double tempSum = 0;
        //loops through all course averages, adding them together to receive a sum
        for (int i = 0; i < 4; i++) {
            tempSum = tempSum + Double.parseDouble(coursesGrades[1][i]);
        }
        //Multiples the sum by the number of courses, and then formats it with decimal formatter. This is then parsed as a double and returned.
        return Double.parseDouble(dd.format(tempSum / numOfCourses()));
    }

    //Returns number of courses
    private int numOfCourses() {
        //Sets course count as the max it can be, which is 4
        int courseCount = 4;
        //Loops through the 2d array, and if it finds the blank course called "Course" subtracts one from the course count, as that is not a valid course.
        for(int i = 0; i < 4;i++)
        {
            if(coursesGrades[0][i].equals("Course"))
            {
                courseCount = courseCount-1;
            }
        }
        //Returns new course count
        return courseCount;
    }

    //Outputs all variable values
    public String toString() {
        return "Student Number is: " + getNumber() +
                "\n\nStudent Name is: " + super.getName() +
                "\n\nStudent School is: " + getSchool() +
                "\n\nStudent Age is: " + +getAge() +
                //The address is separated from the number by a space, so uses substring to output the first half
                "\n\nStudent Address is: " + getContact().substring(0, getContact().lastIndexOf(" ")) +
                //Uses another substring to print the last half to print phone number
                "\n\nStudent Phone Number is: " + getContact().substring(getContact().lastIndexOf(" ") + 1) +
                "\n\nStudent Average is: " + getAverage() +
                "\n\nStudent Grades are as following: \n"
                + "\nCourse 1: " + coursesGrades[0][0] + "\nCourse 1 Grade: " + coursesGrades[1][0]
                + "\n\n\nCourse 2: " + coursesGrades[0][1] + "\nCourse 2 Grade: " + coursesGrades[1][1]
                + "\n\n\nCourse 3: " + coursesGrades[0][2] + "\nCourse 3 Grade: " + coursesGrades[1][2]
                + "\n\n\nCourse 4: " + coursesGrades[0][3] + "\nCourse 4 Grade: " + coursesGrades[1][3];
    }


}
