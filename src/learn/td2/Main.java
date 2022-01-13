package learn.td2;

/**
 * @author phindau
 * @since 13/01/2022, 01:10
 */
public class Main {
    /**
     * Beginning of the program
     *
     * @param args Arguments passed while executing the app
     */
    public static void main(String[] args) {
        Student me;
        me = new Student(985222, "Student", "STUDENT");

        Course course1, course2;
        course1 = new Course("Java", 2);
        course2 = new Course("AlgoTab", 3);

        // Append the courses to the student
        me.addCourses(course1, course2);
        System.out.println(me);

        Student you;
        you = new Student(100044, "Hello", "WORLD");
        you.addCourses(course1, course2);
        System.out.println(you.hasSameCourses(me));


    }
}
