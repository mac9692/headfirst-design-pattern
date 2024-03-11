package strategy;

import strategy.behavior.fly.FlyBehavior;
import strategy.behavior.fly.FlyWithLegs;
import strategy.behavior.quack.QuackBehavior;
import strategy.behavior.quack.QuackLoud;

public class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    private Duck() {}

    private void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    private void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public static Duck getFlyWithLegAndLoudDuck() {
        Duck duck = new Duck();
        duck.setFlyBehavior(new FlyWithLegs());
        duck.setQuackBehavior(new QuackLoud());

        return duck;
    }

    public void fly() {
        flyBehavior.fly();
    }

    public void quack() {
        quackBehavior.quack();
    }
}
