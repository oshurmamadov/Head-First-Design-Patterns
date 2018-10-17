package observer.normal_observer.observers;

import observer.normal_observer.WeatherDataItem;

public interface Observer {
    void update(WeatherDataItem weatherDataItem);
}
