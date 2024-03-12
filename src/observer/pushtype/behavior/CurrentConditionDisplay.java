package observer.pushtype.behavior;

import observer.pushtype.observer.Observer;
import observer.pushtype.subject.Weather;

public class CurrentConditionDisplay implements Observer, Display {
    private float temperature;
    private float humidity;

    public CurrentConditionDisplay(Weather weather) {
        weather.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("현재 기온은 " + temperature + ", 습도는 " + humidity);
    }
}
