package learn.td1;

/**
 * @author phindau
 * @since 13/01/2022, 01:09
 */
public class Course {
    private String title;
    private int credits;

    /**
     * Course Constructor
     *
     * @param title course name
     * @param credits course credits sum
     */
    public Course(String title, int credits)
    {
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
     * Get the credits offered by the course
     *
     * @return credits
     */
    public int getCredits() {
        return this.credits;
    }

    /**
     * Set the course title
     *
     * @param title new title
     */
    public void setTitle(String title) {
        this.title = title;
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
