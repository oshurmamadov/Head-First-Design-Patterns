package singleton;

public class ChocolateBoiler {
    private static ChocolateBoiler chocolateBoiler;

    private boolean isEmpty;
    private boolean isBoiled;

    private ChocolateBoiler() {
    }

    public static ChocolateBoiler getInstance() {
        synchronized (ChocolateBoiler.class) {
            if (chocolateBoiler == null) {
                chocolateBoiler = new ChocolateBoiler();
            }
        }
        return chocolateBoiler;
    }

    public void fill() {
        if (isEmpty) {
            isEmpty = false;
            isBoiled = false;
        }
    }

    public void drain() {
        if(!isEmpty) {
            isEmpty = true;
        }
    }

    public void boil() {
        if(!isEmpty && !isBoiled) {
            isBoiled = true;
        }
    }
}
