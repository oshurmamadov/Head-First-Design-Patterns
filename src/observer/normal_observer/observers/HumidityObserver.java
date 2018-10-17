package observer.normal_observer.observers;

import observer.normal_observer.WeatherDataItem;

public class HumidityObserver implements Observer {

    @Override
    public void update(WeatherDataItem weatherDataItem) {
        System.out.println("--> Humidity is " + weatherDataItem.getHumidity());
    }
}