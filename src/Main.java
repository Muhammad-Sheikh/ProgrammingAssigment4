
public class Main {
    public static void main(String[] args) {

        //Makes a course list and calls the student object with its arguments
        String[] courseList = {"Math", "English", "Chemistry", "History"};
        Student student = new Student(courseList, 3283234, "Muhammad", "Sheikh");

        //Makes 2 teacher objects and calls them with their name and employee number
        Teacher teacher1 = new Teacher(3, "Alan", "Wake");
        Teacher teacher2 = new Teacher(2, "Peter", "Parker");

        //Sets  the grades for the courses we called above to make the student object
        student.setCourseGrade(95.3223, "Math");
        student.setCourseGrade(90.3223, "English");
        student.setCourseGrade(99, "History");
        student.setCourseGrade(95, "Chemistry");

        //Sets other basic information that isn't covered when making the object. Sets address, phone number and age.
        student.setContact(9738113, "25 Thorncliffe Park Drive");
        student.setAge(17);

        //Sets arbitrary seniority values for both teachers
        teacher1.setSeniority(1);
        teacher2.setSeniority(5);

        //Sets other basic information for both teachers that wasn't covered in the constructor. Sets Phone number, address and age for both teachers.
        teacher1.setContact(3738293, "273 Cornwall Drive");
        teacher1.setAge(35);

        teacher2.setContact(46593234, "125 Newark Drive");
        teacher2.setAge(20);
        ///Outputs intro
        System.out.println("Welcome to the School Computer System! This program will provide you with information of a student and 2 teachers at Marc Garneau Collegiate Institute!\n\n");
        System.out.println("First, lets compare the seniority of 2 teachers! We will be comparing teacher " + teacher1.getName() + " against teacher " + teacher2.getName() + "!\n\n");
        System.out.println("Their seniority is as follows: \n\n"
                + teacher1.getName() + "'s seniority is: " + teacher1.getSeniority() + "\n\n"
                + teacher2.getName() + "'s seniority is: " + teacher2.getSeniority());
        System.out.println("\n\nThe lower the seniority, the more senior you are! So lets compare their seniority.\n");
        //Uses the isSenior method to compare seniority, and then output if teacher 2 is more senior or not than teacher 1.
        if (teacher2.isSenior(teacher1)) {
            System.out.println(teacher1.getName() + " is more senior than " + teacher2.getName() + "!");
        } else {
            System.out.println(teacher1.getName() + " is less senior than " + teacher2.getName() + "!");
        }
        System.out.println("\n\nNow, lets look at the average of out student " + student.getName() + " !\n");
        System.out.println(student.getName() + "'s average is " + student.getAverage() + "%!");

        //Compares teacher 1 to teacher 2, and if its more senior it sets its employee number to the more senior one. If not, it sets its employee number to the less senior one, and vice versa for teacher 2.
        if (teacher1.isSenior(teacher2)) {
            teacher1.setNum(111112);
            teacher2.setNum(111111);
        } else {
            teacher2.setNum(111112);
            teacher1.setNum(111111);
        }

        //Outputs the student object and an intro for what the information is
        System.out.println("\n\n\n{Now, lets look at the Information of our Student " + student.getName() + " !}\n");
        System.out.println(student);

        //Outputs the teacher 1 object and an intro for what the information is
        System.out.println("\n\n\n{Now, lets look at the Information of Teacher " + teacher1.getName() + " !}\n");
        System.out.println(teacher1);

        //Outputs the teacher 2 object and an intro for what the information is
        System.out.println("\n\n\n{Now, lets look at the Information of Teacher " + teacher2.getName() + " !}\n");
        System.out.println(teacher2);


    }
}

