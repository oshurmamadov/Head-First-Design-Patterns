package observer;

public interface Observable {
    void registrObserver();
    void removeObserver();
    void notifyObservers();
}
