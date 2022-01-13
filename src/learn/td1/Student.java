package learn.td1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author phindau
 * @since 13/01/2022, 01:11
 */
public class Student {
    private int number;
    private int credits;
    private String firstname, lastname;
    private final List<Course> courses = new ArrayList<>();

    /**
     * Student Constructor
     *
     * @param number student number
     * @param firstname student firstname
     * @param lastname student lastname
     */
    public Student(int number, String firstname, String lastname) {
        this.number = number;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    /**
     * Get the student number
     *
     * @return number
     */
    public int getNumber() {
        return this.number;
    }

    /**
     * Get the student credits
     *
     * @return credits
     */
    public int getCredits() {
        return this.credits;
    }

    /**
     * Get the student firstname
     *
     * @return firstname
     */
    public String getFirstname() {
        return this.firstname;
    }

    /**
     * Get the student lastname
     *
     * @return lastname
     */
    public String getLastname() {
        return this.lastname;
    }

    /**
     * Get all courses concatenated in a String
     *
     * @return courses
     */
    public String getCourses() {
        /*StringBuilder stringBuilder = new StringBuilder();
        for (Course course : this.courses)
            stringBuilder.append(course);
        return stringBuilder.toString();*/
        return this.courses.toString();
    }

    /**
     * Set the official student number
     *
     * @param number template : 000000
     */
    public void setNumber(int number) {
        this.number = number;
    }

    /**
     * Set the student's firstname
     *
     * @param firstname new name
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Set the student's lastname
     *
     * @param lastname new name
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Whatever course you want to add
     *
     * @param courses whatever
     */
    public void addCourses(Course... courses) {
        for (Course course : courses)
            this.credits += course.getCredits();
        this.courses.addAll(Arrays.asList(courses));
    }

    /**
     * toString method override
     *
     * @return string
     */
    @Override
    public String toString() {
        return "Student{" +
                "number=" + this.getNumber() +
                ", credits=" + this.getCredits() +
                ", courses=" + this.getCourses() +
                ", firstname='" + this.getFirstname() + '\'' +
                ", lastname='" + this.getLastname() + '\'' +
                '}';
    }
}
