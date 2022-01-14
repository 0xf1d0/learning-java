package learn.tp1;

/**
 * @author vcohadon
 * @link vincent.cohadon@etudiant.univ-lr.fr
 * @since 14/01/2022, 16:03
 */
public class MovingObject {
    private final String name;
    private Integer x, y;
    private Double ray;

    private static final Double DELTA_R = 5.0;

    /**
     * MovingObject Constructor
     *
     * @param name its name
     * @param x its x
     * @param y its y
     * @param ray its ray
     */
    public MovingObject(String name, Integer x, Integer y, Double ray) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.ray = ray;
    }

    /**
     * Get Moving Object's name
     *
     * @return name as String
     */
    public String getName() {
        return this.name;
    }

    /**
     * Get X value
     *
     * @return x as Integer
     */
    public Integer getX() {
        return this.x;
    }

    /**
     * Get Y value
     *
     * @return y as Integer
     */
    public Integer getY() {
        return this.y;
    }

    /**
     * Get the ray
     *
     * @return ray as Double
     */
    public Double getRay() {
        return this.ray;
    }

    /**
     * Set its X value
     *
     * @param x as Integer
     */
    public void setX(Integer x) {
        this.x = x;
    }

    /**
     * Set its Y value
     *
     * @param y as Integer
     */
    public void setY(Integer y) {
        this.y = y;
    }

    /**
     * Set its ray value
     *
     * @param ray as Double
     */
    public void setRay(Double ray) {
        this.ray = ray;
    }

    /**
     * Move the object
     *
     * @param dx distance x
     * @param dy distance y
     */
    public void move(Integer dx, Integer dy) {
        this.x += dx;
        this.y += dy;
    }

    /**
     * Increase the ray of delta const
     *
     * @return new ray
     */
    public Double increase() {
        return this.ray += DELTA_R;
    }

    /**
     * Increase the ray of a given value (overload)
     *
     * @param delta double
     * @return new ray
     */
    public Double increase(Double delta) {
        return this.ray += delta;
    }

    /**
     * Decrease the ray of delta const
     *
     * @return new ray
     */
    public Double decrease() {
        return this.ray -= DELTA_R;
    }

    /**
     * Decrease the ray of a given value (overload)
     *
     * @param delta double
     * @return new ray
     */
    public Double decrease(Double delta) {
        return this.ray -= delta;
    }

    /**
     * Is the ray equals to 0.0 ? (a point)
     *
     * @return true/false whether the ray value
     */
    public boolean isPoint() {
        return this.ray.equals(0.0);
    }

    public boolean collision(MovingObject that) {
        return Math.sqrt(Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)) < this.ray + that.ray;
    }

    /**
     * Consume another Object
     *
     * @param that the object
     */
    public void consume(MovingObject that) {
        if (this.collision(that)) {
            this.ray += that.ray;
            that.ray = 0.0;
        }
    }

    /**
     * Be consumed by another Object
     *
     * @param that the object
     */
    public void consumedBy(MovingObject that) {
        if (this.collision(that)) {
            that.ray += this.ray;
            this.ray = 0.0;
        }
    }

    /**
     * Split into another MovingObject
     *
     * @return MovingObject
     */
    public MovingObject split() {
        return new MovingObject(this.name, this.x + 2, this.y + 2, this.ray / 2);
    }

    /**
     * Split into another MovingObject following the parents this and param perks
     *
     * @param that another MovingObject
     * @return the MovingObject obtained
     */
    public MovingObject split(MovingObject that) {
        return new MovingObject(this.name, this.x + that.x, this.y + that.y, this.ray + that.ray);
    }

    /**
     * Override of toString method
     *
     * @return String info
     */
    @Override
    public String toString() {
        return "MovingObject{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                ", ray=" + ray +
                '}';
    }
}
