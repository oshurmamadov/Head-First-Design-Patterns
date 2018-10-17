package observer.reverse_observer.observers;

import observer.reverse_observer.WeatherDataItem;

public interface Observer {
    void update(WeatherDataItem weatherDataItem);
    void observe();
    void remove();
}
