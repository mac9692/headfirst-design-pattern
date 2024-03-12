package observer.pulltype.behavior;

import observer.pulltype.observer.Observer;
import observer.pulltype.subject.Weather;

public class CurrentConditionDisplay implements Observer, Display {
    private float temperature;
    private float humidity;
    private Weather weather;

    public CurrentConditionDisplay(Weather weather) {
        this.weather = weather;
        weather.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weather.getTemperature();
        this.humidity = weather.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("현재 기온은 " + temperature + ", 습도는 " + humidity);
    }
}
