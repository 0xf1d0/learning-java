package learn.td1;

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
        Student vincent;
        vincent = new Student(213231, "Vincent", "C");

        Course course1, course2;
        course1 = new Course("Java", 2);
        course2 = new Course("AlgoTab", 3);

        // Append the courses to the student
        vincent.addCourses(course1, course2);
        System.out.println(vincent);
    }
}
