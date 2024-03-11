package strategy.behavior.quack;

public class QuackLoud implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("시끄럽게 꽥꽥");
    }
}
