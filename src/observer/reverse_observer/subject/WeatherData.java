package observer.reverse_observer.subject;

import observer.reverse_observer.WeatherDataItem;
import observer.reverse_observer.observers.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Observable {
    private List<Observer> observers;
    private WeatherDataItem weatherDataItem;

    public WeatherData() {
        observers = new ArrayList<>();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer: observers) {
            observer.update(weatherDataItem);
        }
    }

    public void measurementsChanged() {
        System.out.println("Weather data changed");
        notifyObservers();
    }

    // Just for test case to simulate we got data from any source
    public void setWeatherData(WeatherDataItem item) {
        this.weatherDataItem = item;
        measurementsChanged();
    }
}