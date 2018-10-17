package observer.reverse_observer.subject;

import observer.reverse_observer.observers.Observer;

public interface Observable {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
