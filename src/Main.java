import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        Teacher teacher1 = new Teacher();
        Teacher teacher2 = new Teacher();

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

