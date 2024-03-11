package strategy.behavior.quack;

public class QuackSilent implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("침묵");
    }
}
