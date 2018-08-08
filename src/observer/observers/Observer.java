package observer.observers;

import observer.WeatherDataItem;

public interface Observer {
    void update(WeatherDataItem weatherDataItem);
}
