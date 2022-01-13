package learn.td2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author phindau
 * @since 13/01/2022, 19:26
 */
public class Professor {
    private String firstname;
    private final String lastname;
    private final List<Course> courses = new ArrayList<>();

    /**
     * Professor constructor
     *
     * @param firstname the firstname of the professor
     * @param lastname the lastname of the professor
     */
    public Professor(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /**
     * Get the professor's firstname
     *
     * @return firstname of the professor
     */
    public String getFirstname() {
        return this.firstname;
    }

    /**
     * Get the professor's lastname
     *
     * @return lastname of the professor
     */
    public String getLastname() {
        return this.lastname;
    }

    /**
     * Get the courses the teacher is responsible for
     *
     * @return the courses as string
     */
    public String getCourses() {
        return this.courses.toString();
    }

    /**
     * Set the professor's firstname
     *
     * @param firstname whatever firstname we want
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Add the courses that the professor is responsible for
     *
     * @param courses array of courses
     */
    public void addCourses(Course... courses) {
        this.courses.addAll(Arrays.asList(courses));
    }

    /**
     * Add a single course without creating instance of Course
     *
     * @param title the title of the course
     * @param credits the credits given by the course
     */
    public void addCourse(String title, int credits) {
        this.courses.add(new Course(title, credits));
    }
}
