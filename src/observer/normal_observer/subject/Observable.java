package observer.normal_observer.subject;

import observer.normal_observer.observers.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
