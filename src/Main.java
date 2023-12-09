import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        String[] test = {"90", "20", "30", "40"};
        Student student = new Student(test, 2, "city", "hello");
        Teacher teacher1 = new Teacher(3, "Bruh", "Sender");
        Teacher teacher2 = new Teacher(2,"Bruh2", "city2" );

        student.test();

        student.setCourseGrade(20, "Math");

        student.setCourseGrade(60, "English");

        student.setCourseGrade(30, "History");

        student.setCourseGrade(90, "Chem");

        teacher1.seniority = 1;
        teacher2.seniority = 5;

        if(teacher2.isSenior(teacher1))
        {
            System.out.println("More Senior");
        } else
        {
            System.out.println("Less Senior");
        }

    }
}

