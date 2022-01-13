package learn.td2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author phindau
 * @since 13/01/2022, 01:11
 */
public class Student {
    private final int number;
    private int credits;
    private String firstname;
    private final String lastname;
    private String mention;
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
     * Student Constructor 2
     *
     * @param number student number
     * @param firstname student firstname
     * @param lastname student lastname
     * @param mention student mention example: "MATHS"
     * @param high the course that represent his mention
     * @param low the course that he has chosen in addition of the high course...
     */
    public Student(int number, String firstname, String lastname, String mention, Course high, Course low) {
        this.number = number;
        this.firstname = firstname;
        this.lastname = lastname;
        this.mention = mention;
        this.addCourses(high, low);
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
     * Get the mention chosen by the student
     *
     * @return mention
     */
    public String getMention() {
        return this.mention;
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
     * Get professors names linked with this student
     *
     * @return professors names
     */
    public String getProfessors() {
        StringBuilder professors = new StringBuilder();
        for (Course course : this.courses)
            professors.append(course.getProfessor().getLastname());
        return professors.toString();
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
     * Set the mention chosen by the student
     *
     * @param mention the mention chosen
     */
    public void setMention(String mention) {
        this.mention = mention;
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
     * Apply to a course with a name and credits
     *
     * @param title title of the course
     * @param credits credits offered by the course
     */
    public void addCourse(String title, int credits) {
        Course course = new Course(title, credits);
        this.credits += course.getCredits();
        this.courses.add(course);
    }

    /**
     * Compare the courses followed by this student with another one
     *
     * @param student Student class
     * @return true/false returned by the comparison
     */
    public boolean hasSameCourses(Student student) {
        return this.courses.equals(student.courses);
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
