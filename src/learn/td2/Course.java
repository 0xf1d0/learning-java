package learn.td2;

/**
 * @author phindau
 * @since 13/01/2022, 01:09
 */
public class Course {
    private final String title;
    private Professor professor;
    private int credits;

    /**
     * Course Constructor
     *
     * @param title course name
     * @param credits course credits sum
     */
    public Course(String title, int credits) {
        this.title = title;
        this.credits = credits;
    }

    /**
     * Get entitled course
     *
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * Get the professor responsible for this course
     *
     * @return professor
     */
    public Professor getProfessor() {
        return this.professor;
    }

    /**
     * Get the credits offered by the course
     *
     * @return credits
     */
    public int getCredits() {
        return this.credits;
    }

    /**
     * Set the professor responsible for this course
     *
     * @param professor the professor class
     */
    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    /**
     * Set the credits offered by the course
     *
     * @param credits number of credits
     */
    public void setCredits(int credits) {
        this.credits = credits;
    }

    /**
     * toString method override
     *
     * @return string
     */
    @Override
    public String toString() {
        return "Course{" +
                "title='" + this.getTitle() + '\'' +
                ", credits=" + this.getCredits() +
                '}';
    }
}
