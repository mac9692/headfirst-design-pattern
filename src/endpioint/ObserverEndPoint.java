package endpioint;

import observer.pushtype.behavior.CurrentConditionDisplay;
import observer.pushtype.behavior.OnlyPressureDisplay;
import observer.pushtype.subject.Weather;

public class ObserverEndPoint {
    public static void main(String[] args) {
        pushTypeObserver();
        pullTypeObserver();
    }

    private static void pullTypeObserver() {
        observer.pulltype.subject.Weather weather = new observer.pulltype.subject.Weather();
        observer.pulltype.behavior.CurrentConditionDisplay currentConditionDisplay = new observer.pulltype.behavior.CurrentConditionDisplay(weather);
        observer.pulltype.behavior.OnlyPressureDisplay onlyPressureDisplay = new observer.pulltype.behavior.OnlyPressureDisplay(weather);

        weather.setData(11F, 23F, 22F);
    }

    private static void pushTypeObserver() {
        Weather weather = new Weather();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weather);
        OnlyPressureDisplay onlyPressureDisplay = new OnlyPressureDisplay(weather);

        weather.setData(17F, 22F, 30F);
    }
}
