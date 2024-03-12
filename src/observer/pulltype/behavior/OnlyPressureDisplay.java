package observer.pulltype.behavior;

import observer.pulltype.observer.Observer;
import observer.pulltype.subject.Weather;

public class OnlyPressureDisplay implements Observer, Display {
    private float pressure;
    private Weather weather;

    public OnlyPressureDisplay(Weather weather) {
        this.weather = weather;
        weather.registerObserver(this);
    }

    @Override
    public void update() {
        this.pressure = weather.getPressure();
        display();
    }

    @Override
    public void display() {
        System.out.println("현재 기압은 " + pressure);
    }
}
