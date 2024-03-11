import strategy.Duck;

public class Main {
    public static void main(String[] args) {
        Duck duck = Duck.getFlyWithLegAndLoudDuck();
        duck.fly();
        duck.quack();
    }
}