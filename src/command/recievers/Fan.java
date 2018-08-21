package command.recievers;

public class Fan {
    public static final int HIGH = 2;
    public static final int MEDIUM = 1;
    public static final int OFF = 0;
    private int speed = OFF;

    public void highSpeed() {
        speed = HIGH;
    }

    public void mediumSpeed() {
        speed = MEDIUM;
    }

    public void off() {
        speed = OFF;
    }

    public int getSpeed() {
        return speed;
    }
}
