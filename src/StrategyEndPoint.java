import strategy.Duck;

public class StrategyEndPoint {
    public static void main(String[] args) {
        Duck duck = Duck.getFlyWithLegAndLoudDuck();
        duck.fly();
        duck.quack();
    }
}