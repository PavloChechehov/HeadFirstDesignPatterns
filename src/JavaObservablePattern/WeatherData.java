package JavaObservablePattern;

import java.util.Observable;

public class WeatherData extends Observable {
    private float temperature, pressure, humidity;


    public WeatherData() {
    }

    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }
}
