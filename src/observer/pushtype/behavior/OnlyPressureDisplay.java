package observer.pushtype.behavior;

import observer.pushtype.observer.Observer;
import observer.pushtype.subject.Weather;

public class OnlyPressureDisplay implements Observer, Display {
    private float pressure;

    public OnlyPressureDisplay(Weather weather) {
        weather.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("현재 기압은 " + pressure);
    }
}
