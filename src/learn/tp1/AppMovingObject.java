package learn.tp1;

/**
 * @author phindau
 * @since 14/01/2022, 16:11
 */
public class AppMovingObject {

    /**
     * Beginning of the program, testing the objects
     *
     * @param args passed while executing the program
     */
    public static void main(String[] args) {
        MovingObject movingObject1;
        movingObject1 = new MovingObject("First", 0, 1, 20.0);

        MovingObject movingObject2;
        movingObject2 = new MovingObject("Second", 1, 0, 30.0);

        System.out.println(movingObject1);
        System.out.println(movingObject2);

        movingObject1.consume(movingObject2);
        System.out.println(movingObject2);
    }
}
