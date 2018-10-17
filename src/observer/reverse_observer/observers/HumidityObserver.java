package observer.reverse_observer.observers;

import observer.reverse_observer.WeatherDataItem;
import observer.reverse_observer.subject.Observable;

public class HumidityObserver implements Observer {
    private Observable observable;

    public HumidityObserver(Observable observable) {
        this.observable = observable;
    }
    @Override
    public void update(WeatherDataItem weatherDataItem) {
        System.out.println("--> Humidity is " + weatherDataItem.getHumidity());
    }

    @Override
    public void observe() {
        observable.registerObserver(this);
    }

    @Override
    public void remove() {
        observable.removeObserver(this);
    }
}