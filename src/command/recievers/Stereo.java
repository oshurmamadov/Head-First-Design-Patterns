package command.recievers;

public class Stereo {
    private String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " is on");
    }

    public void off() {
        System.out.println(name + " is off");
    }

    public void setVolume(int volume) {
        System.out.println(name + " volume set to " + volume);
    }
}
