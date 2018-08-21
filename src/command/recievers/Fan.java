package command.recievers;

public class Fan {
    private String name;

    public static final int HIGH = 2;
    public static final int MEDIUM = 1;
    public static final int OFF = 0;
    private int speed = OFF;

    public Fan(String name) {
        this.name = name;
    }
    public void highSpeed() {
        speed = HIGH;
        System.out.println(name + "speed is " + getSpeed());
    }

    public void mediumSpeed() {
        speed = MEDIUM;
        System.out.println(name + "speed is " + getSpeed());
    }

    public void off() {
        speed = OFF;
        System.out.println(name + "speed is " + getSpeed());
    }

    public int getSpeed() {
        return speed;
    }
}
