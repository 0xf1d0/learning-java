package learn.tp3;

/**
 * @author phindau
 * @since 19/01/2022, 11:28
 */
public class Panel {
    private boolean[] lights = new boolean[5];

    /**
     * Panel Constructor
     * Initialise the 5 lights with random switch on or off
     */
    public Panel() {
        for (int i = 0; i < 5; ++i)
            this.lights[i] = Math.random() > 0.5;
    }

    /**
     * Check if all the lights are turned on
     *
     * @return true/false whether it's the case or not
     */
    public boolean areTurnedOn() {
        for (boolean status : this.lights)
            if (!status) return false;
        return true;
    }

    /**
     * This quite complex and compact function implements different
     * switches (1:5) to turn on/off lights
     * using the following model:
     * - Switch 1 changes the state of light 2
     * - Switch 2 changes the state of light 2 and 3
     * - Switch 3 changes the state of light 3 and 4
     * - Switch 4 changes the state of light 4 and 5
     * - Switch 5 changes the state of light 1 and 5
     *
     * The process: (for n = 1)
     * condition == false
     * so the last line is only executed,
     * and this is what we want for this case, to switch the state of light 2 only.
     *
     * (for other cases, n = 2:5)
     * condition == true
     * we go inside the condition, and change the state of the previous value inside the array,
     * as explained in the model.
     * then the last line is only executed, and we changed the state of 2 lights in the array.
     *
     * PS: Switching the state is by using a xor between the value in the array and true.
     * So if it's true, it returns false and if it's false it returns true.
     *
     * @param n switch (short)
     */
    public void switcher(short n) {
        if (n != 1)
            this.lights[(n - 1) % 5] ^= true;
        this.lights[n % 5] ^= true;
    }

    /**
     * Turn all the lights off
     */
    public void reset() {
        this.lights = new boolean[5];
    }

    /**
     * toString override to display a string like this:
     * [XXXOX]
     *
     * @return String
     */
    @Override
    public String toString() {
        StringBuilder panel = new StringBuilder("[");
        for (boolean status : this.lights)
            panel.append(status ? "X" : "O");
        return panel.append("]").toString();
    }
}
