package observer.observers;

import observer.WeatherDataItem;

public class HumidityObserver implements Observer {

    @Override
    public void update(WeatherDataItem weatherDataItem) {
        System.out.println("--> Humidity is " + weatherDataItem.getHumidity());
    }
}