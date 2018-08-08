package observer.observers;

import observer.WeatherDataItem;

public class TemperatureObserver implements Observer {

    @Override
    public void update(WeatherDataItem weatherDataItem) {
        System.out.println("--> Temp is " + weatherDataItem.getTemperature());
    }
}