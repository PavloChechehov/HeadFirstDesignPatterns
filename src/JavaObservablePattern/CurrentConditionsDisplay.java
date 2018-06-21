package JavaObservablePattern;

import Observer1.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    Observable observable;
    private float humidity, temperature;

    public CurrentConditionsDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature
                + "F degrees and " + humidity + "% humidity");
    }

    @Override
    public void update(Observable obs, Object arg) {
        if (obs instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) obs;
            humidity = weatherData.getHumidity();
            temperature = weatherData.getTemperature();
            display();
        }
    }
}
